package com.technical.challenge.app.technicalchallenge.model.service;

import java.util.List;

import com.technical.challenge.app.technicalchallenge.model.entity.TipoCambio;
import com.technical.challenge.app.technicalchallenge.model.webDto.TipoCambioWebDto;

public interface TipoCambioService {
	
	public List<TipoCambio> findAll();
	public TipoCambio findById(Long id);
	//public Double obtenerTipoCambio(String monedaOrigen, String monedaDestino, String tipoFactor);
	public Double calcularTipoCambio(String monedaOrigen, String monedaDestino, String tipoFactor, Double monto);
	public TipoCambioWebDto calcularConversion(Double monto, String monedaOrigen, String monedaDestino, String tipoFactor);
	

}
