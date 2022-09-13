package com.ejemplo.springboot.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.springboot.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
