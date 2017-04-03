package com.vonotte.service.category;

import com.vonotte.dto.category.CategoryDTO;
import com.vonotte.dto.category.CategoryPostDTO;
import com.vonotte.exceptions.InvalidDataException;


public interface CategoryService {

	/**
	 * Da de alta una categoria en el sistema
	 * 
	 * @param CategoryPostDTO
	 * @return CategoryDTO
	 * @throws InvalidDataException
	 * 
	 */
	CategoryDTO create(CategoryPostDTO category) throws InvalidDataException;
}
