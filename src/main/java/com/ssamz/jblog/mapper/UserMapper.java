package com.ssamz.jblog.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.ssamz.jblog.domain.User;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USERS(ID, USERNAME, PASSWORD, EMAIL) "
            + "VALUES ((SELECT NVL(MAX(ID), 0) + 1 FROM USERS), #{username}, #{password}, #{email})")
    void insertUser(User user);

    @Update("UPDATE USERS PASSWORD = #{password}, EMAIL = #{email} WHERE ID = #{id}")
    void updateUser(User user);

    @Delete("DELETE FROM USERS WHERE ID = #{id}")
    void deleteUser(User user);

    @Select("SELECT * FROM USERS WHERE USERNAME = #{username}")
    public void getUser(User user);

    @Select("SELECT * FROM USERS ORDER BY USERNAME DESC")
    public List<User> getUserList();
}