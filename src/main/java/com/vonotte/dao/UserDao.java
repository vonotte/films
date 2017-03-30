package com.vonotte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vonotte.model.User;


@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	
}
