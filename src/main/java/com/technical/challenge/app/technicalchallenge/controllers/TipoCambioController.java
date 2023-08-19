package com.technical.challenge.app.technicalchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge.app.technicalchallenge.model.entity.TipoCambio;
import com.technical.challenge.app.technicalchallenge.model.service.TipoCambioService;
import com.technical.challenge.app.technicalchallenge.model.webDto.TipoCambioWebDto;

@RestController
public class TipoCambioController {
	
	@Autowired
	public TipoCambioService tipoCambioService;
	
	@GetMapping("/listarTipos")
	public List<TipoCambio> listarTipos(){
		return tipoCambioService.findAll();
	};
	
	@GetMapping("/listarTipo/{id}")
	public TipoCambio listarPorId(@PathVariable Long id){
		return tipoCambioService.findById(id);
	};
	
	@GetMapping("/convertir/{monedaOrigen}/{monedaDestino}/{tipoFactor}/{monto}")
	public Double procesarConversion(@PathVariable String monedaOrigen, @PathVariable String monedaDestino, 
			@PathVariable String tipoFactor,
			@PathVariable Double monto){
		return tipoCambioService.calcularTipoCambio(monedaOrigen, monedaDestino, tipoFactor, monto);
	};
	
	@GetMapping("/convertirFormat/{monto}/{monedaOrigen}/{monedaDestino}/{tipoFactor}")
	public TipoCambioWebDto procesarConversionFormato(@PathVariable Double monto, @PathVariable String monedaOrigen, 
			@PathVariable String monedaDestino, @PathVariable String tipoFactor){
		return tipoCambioService.calcularConversion(monto, monedaOrigen, monedaDestino, tipoFactor);
	};

}
