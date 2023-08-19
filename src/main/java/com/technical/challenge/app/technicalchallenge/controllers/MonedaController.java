package com.technical.challenge.app.technicalchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge.app.technicalchallenge.model.entity.Moneda;
import com.technical.challenge.app.technicalchallenge.model.service.MonedaService;

@RestController
public class MonedaController {
	
	@Autowired
	public MonedaService monedaService;
	
	@GetMapping("/listar")
	public List<Moneda> listar(){
		return monedaService.findAll();
	};
	
	@GetMapping("/listar/{moneda}")
	public Moneda listarPorCodigo(@PathVariable String moneda){
		return monedaService.findById(moneda);
	};

}
