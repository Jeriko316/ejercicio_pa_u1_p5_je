package com.uce.edu.matriculacion.repository;

import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

public interface IVehiculoRepository {

	public Vehiculo buscar(String numPlaca);

	public void guardar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String numPlaca);

	
}
