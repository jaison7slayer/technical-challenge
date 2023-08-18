package com.technical.challenge.app.technicalchallenge.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.technical.challenge.app.technicalchallenge.model.entity.Moneda;

public interface MonedaDao extends CrudRepository<Moneda, String>{

}
