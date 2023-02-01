package com.te.resume.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.resume.dto.UserDto;
import com.te.resume.response.Response;
import com.te.resume.service.UserService;
@RestController
public class Usercontroller {
	@Autowired
	private UserService userService;
	@Autowired
	private Response response;
	@PostMapping("/register")
	public ResponseEntity<Response> register(@RequestBody UserDto userDto) {
		UserDto usDto=userService.register(userDto);

		if (usDto != null) {
			response.setError(false);
			response.setMessage("registered");
			response.setStatus(200);
			response.setData(Arrays.asList(usDto));
			return new ResponseEntity<Response>(response, HttpStatus.CREATED);
		} else {
			response.setError(true);
			response.setMessage("not registered");
			response.setStatus(401);
			response.setData(Arrays.asList(usDto));
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
	}
}
