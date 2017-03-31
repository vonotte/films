package com.vonotte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vonotte.model.Evaluation;

@Repository
public interface EvaluationDao extends CrudRepository<Evaluation, Integer>{

}
