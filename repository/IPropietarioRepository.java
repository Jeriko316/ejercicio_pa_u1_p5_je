package com.uce.edu.matriculacion.repository;

import java.util.List;

import com.uce.edu.matriculacion.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario buscar(String identificacion);

	public void crear(Propietario propietario);

	public void eliminar(String identificacion);

	public List<Propietario> buscarPropietarios();

}
