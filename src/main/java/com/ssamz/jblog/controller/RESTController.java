package com.ssamz.jblog.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ssamz.jblog.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

//REST 컨트롤러: 메소드가 반환한 데이터를 자동으로 javaScript 객체 노테이션 타입(Object Notation, JSON)으로 변환
@RestController
public class RESTController {	

	// GET: Select
	@GetMapping("/jblog")
	public User httpGet() {
		User findUser = User.builder()
				.id(1)
				.username("gurum")
				.password("222")
				.email("gurum@gmail.com")
				.build();
		return findUser;
	}
	
	// POST: Insert
	@PostMapping("/jblog")
	public String httpPost(@RequestBody User user) {
		return "Post 요청 처리 입력값: " + user.toString();
	}
	
	// PUT: Update	
	@PutMapping("/jblog")
	public String httpPut(@RequestBody User user) {
		return "Put 요청 처리 입력값 : " + user.toString();
	}
	
	// DELETE: Delete
	@DeleteMapping("/jblog")
	public String httpDelete(@RequestParam int id) {
		return "Delete 요청 처리 입력값 : " + id;
	}
	

}
