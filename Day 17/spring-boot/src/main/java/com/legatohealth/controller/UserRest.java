package com.legatohealth.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legatohealth.beans.Message;
import com.legatohealth.beans.User;
import com.legatohealth.exceptions.UserNotFoundException;
import com.legatohealth.service.UserService;

@RestController
@RequestMapping("api")
public class UserRest {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		ResponseEntity<Object> response = null;
		User createdUser = userService.store(user);
		response = ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
		return response;
	}

	@GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getUsers() {
		ResponseEntity<Object> response = null;
		List<User> list = userService.fetchAllUsers();
		response = ResponseEntity.status(HttpStatus.OK).body(list);
		return response;
	}

	@GetMapping(path = "user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getUser(@PathVariable("userId") int id) {
		ResponseEntity<Object> response = null;
		try {
			User userFound = userService.fetchUser(id);
			response = ResponseEntity.status(HttpStatus.FOUND).body(userFound);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	@DeleteMapping(path = "user/{userId}")
	public ResponseEntity<Object> deleteUser(@PathVariable("userId") int id) {
		ResponseEntity<Object> response = null;
		try {
			userService.deleteUser(id);
			Message message = new Message("User with ID : " + id + " is deleted", 200);
			response = ResponseEntity.status(HttpStatus.OK).body(message);
		} catch (UserNotFoundException e) {
			Message message = new Message(e.getMessage(), 404);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
			e.printStackTrace();
		}
		return response;
	}

	@PutMapping(path = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updatePassword(@RequestBody User user) {
		
		ResponseEntity<Object> response = null;
		try {
			User updateUser = userService.updatePassword(user.getUserId(), user.getPassword());
			
			response = ResponseEntity.status(HttpStatus.OK).body(updateUser);
		} catch (UserNotFoundException e) {
			Message message = new Message(e.getMessage(), 404);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
			e.printStackTrace();
		}
		return response;
	}
}
