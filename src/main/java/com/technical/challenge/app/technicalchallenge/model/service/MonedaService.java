package com.technical.challenge.app.technicalchallenge.model.service;

import java.util.List;

import com.technical.challenge.app.technicalchallenge.model.entity.Moneda;

public interface MonedaService {
	
	public List<Moneda> findAll();
	public Moneda findById(String moneda);

}
