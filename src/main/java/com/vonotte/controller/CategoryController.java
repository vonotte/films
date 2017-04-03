package com.vonotte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vonotte.dto.category.CategoryDTO;
import com.vonotte.dto.category.CategoryPostDTO;
import com.vonotte.exceptions.InvalidDataException;
import com.vonotte.service.category.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(method = RequestMethod.POST)
	public CategoryDTO create(@RequestBody CategoryPostDTO c) throws InvalidDataException{
		return categoryService.create(c);
	}

}
