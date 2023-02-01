package com.te.resume.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.te.resume.dto.ProfileDto;
import com.te.resume.response.Response;
import com.te.resume.service.ProfileService;

@RestController
public class ProfileController {
	@Autowired
	private ProfileService profileService;
	@Autowired
	private Response response;

	@PostMapping("/addProfile")
	public ResponseEntity<Response> addProfile(@RequestBody ProfileDto profileDto) {
		ProfileDto profile = profileService.addProfile(profileDto);

		if (profile != null) {
			response.setError(false);
			response.setMessage("Profile is added");
			response.setStatus(200);
			response.setData(Arrays.asList(profile));
			return new ResponseEntity<Response>(response, HttpStatus.CREATED);
		} else {
			response.setError(true);
			response.setMessage("Profile is not added");
			response.setStatus(401);
			response.setData(Arrays.asList(profile));
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Response> getById(@PathVariable Integer id ){
		ProfileDto profile = profileService.getById(id);

		if (profile != null) {
			response.setError(false);
			response.setMessage("got all");
			response.setStatus(200);
			response.setData(Arrays.asList(profile));
			return new ResponseEntity<Response>(response, HttpStatus.CREATED);
		} else {
			response.setError(true);
			response.setMessage("error");
			response.setStatus(401);
			response.setData(Arrays.asList(profile));
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/update{id}")
	public ResponseEntity<Response> update(@RequestBody ProfileDto profileDto,@PathVariable Integer id){
		ProfileDto profile = profileService.update(profileDto,id);

		if (profile != null) {
			response.setError(false);
			response.setMessage("updated");
			response.setStatus(200);
			response.setData(Arrays.asList(profile));
			return new ResponseEntity<Response>(response, HttpStatus.CREATED);
		} else {
			response.setError(true);
			response.setMessage("not updated");
			response.setStatus(401);
			response.setData(Arrays.asList(profile));
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
	}
	
}
