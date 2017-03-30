package com.vonotte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vonotte.model.Film;


@Repository
public interface FilmDao extends CrudRepository<Film, Integer> {

}
