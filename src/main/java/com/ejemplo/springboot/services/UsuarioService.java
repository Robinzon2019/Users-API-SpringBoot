package com.ejemplo.springboot.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.springboot.models.UsuarioModel;
import com.ejemplo.springboot.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return (ArrayList<UsuarioModel>) this.repository.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return this.repository.save(usuario);
	}
	
	public Optional<UsuarioModel> obtenrPorId(Long id){
		return this.repository.findById(id);
	}
	
	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
		return this.repository.findByPrioridad(prioridad);
	}
	
	public boolean eliminarUsuario(Long id) {
		try {
			this.repository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}
