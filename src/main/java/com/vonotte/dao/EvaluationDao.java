package com.vonotte.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vonotte.model.Evaluation;
import com.vonotte.model.Film;
import com.vonotte.model.User;

@Repository
public interface EvaluationDao extends CrudRepository<Evaluation, Integer>{

	@Query(value=""
				+"SELECT r "
				+"FROM evaluation r "
				+"WHERE (r.film= :film) AND (r.user= :user)")
	Evaluation findEvaluationUser(@Param(value = "film") Film film, @Param(value = "user") User user);
}
