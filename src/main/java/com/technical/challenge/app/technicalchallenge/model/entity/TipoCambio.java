package com.technical.challenge.app.technicalchallenge.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_cambio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCambio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7063087416410792266L;
	
	@Id
	private Long id;
	
	private String monedaOrigen;
	private String monedaDestino;
	private String tipoFactor;
	private Double factorCambio;
	private String createUser;
	
}
