package com.vonotte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vonotte.dto.user.UserDTO;
import com.vonotte.dto.user.UserPostDTO;
import com.vonotte.service.user.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(method = { RequestMethod.GET })
	public List<UserDTO> getAll() {		
		return userservice.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserDTO findById(@PathVariable("id") Integer id) {
		return userservice.findUserById(id);
	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public UserDTO create(@RequestBody UserPostDTO u){
		return userservice.create(u);
	}

}
