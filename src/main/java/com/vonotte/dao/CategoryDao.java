package com.vonotte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vonotte.model.Category;

@Repository
public interface CategoryDao extends CrudRepository<Category, Integer>{

}
