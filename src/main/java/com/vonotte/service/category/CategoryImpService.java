package com.vonotte.service.category;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vonotte.dao.CategoryDao;
import com.vonotte.dto.category.CategoryDTO;
import com.vonotte.dto.category.CategoryPostDTO;
import com.vonotte.exceptions.InvalidDataException;
import com.vonotte.model.Category;

@Service
public class CategoryImpService implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	
	@Override
	public CategoryDTO create(CategoryPostDTO category) throws InvalidDataException{
		if(category.getName()!=null){
			Category c= new Category();
			c.setCreatedAt(new Date());
			c.setUpdatedAt(new Date());
			c.setName(category.getName());
			categoryDao.save(c);
			return new CategoryDTO(c.getId(),c.getName());			
		}		
		throw new InvalidDataException("Los datos no son correctos");
	}

}
