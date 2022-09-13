package com.ejemplo.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long id;
	
	@Column(name="nombre", length=60, nullable=false)
	private String nombre;
	
	@Column(name="email", length=60, nullable=false, unique=true)
	private String email;
	
	@Column(name="prioridad", nullable=false)
	private Integer prioridad;
	
	public UsuarioModel() {
		
	}
	
	public UsuarioModel(Long id, String nombre, String email, Integer prioridad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.prioridad = prioridad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}
	
	
	
	

}
