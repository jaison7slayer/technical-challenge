package com.technical.challenge.app.technicalchallenge.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "moneda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Moneda implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -482883736075445094L;

	@Id
	private String codigo;
	
	private String pais;
	private String simbolo;
	
	private String createUser;

}
