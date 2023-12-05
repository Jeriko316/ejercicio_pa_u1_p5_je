package com.uce.edu.matriculacion.service;

import java.util.List;

import com.uce.edu.matriculacion.repository.modelo.Propietario;

public interface IPropietarioService {

	public Propietario buscar(String identifiacion);
	public void crear(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void eliminar(String identifacion);
	
	public List<Propietario> buscarPropietarios();
	
}
