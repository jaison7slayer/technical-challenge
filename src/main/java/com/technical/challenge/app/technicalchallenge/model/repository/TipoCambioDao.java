package com.technical.challenge.app.technicalchallenge.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.technical.challenge.app.technicalchallenge.model.entity.TipoCambio;
import com.technical.challenge.app.technicalchallenge.model.webDto.TipoCambioWebDto;

public interface TipoCambioDao extends JpaRepository<TipoCambio, Long> {
	
	@Query(value = "SELECT FACTOR_CAMBIO FROM tipo_cambio "
			+ "WHERE MONEDA_ORIGEN = :monedaOrigen "
			+ "AND MONEDA_DESTINO = :monedaDestino "
			+ "AND TIPO_FACTOR = :tipoFactor", nativeQuery = true)
	Double obtenerTipoCambio (String monedaOrigen, String monedaDestino, String tipoFactor);
	
	@Query(value = "SELECT :monto as monto, :monto * FACTOR_CAMBIO as montoConTipoCambio, "
			+ " MONEDA_ORIGEN as monedaOrigen, MONEDA_DESTINO as monedaDestino, "
			+ " TIPO_FACTOR as tipoFactorCambio, FACTOR_CAMBIO as tipoCambio "
			+ "FROM tipo_cambio "
			+ "WHERE MONEDA_ORIGEN = :monedaOrigen "
			+ "AND MONEDA_DESTINO = :monedaDestino "
			+ "AND TIPO_FACTOR = :tipoFactor", nativeQuery = true)
	TipoCambioWebDto obtenerTipoCambioFormato (Double monto, String monedaOrigen, String monedaDestino, String tipoFactor);

}
