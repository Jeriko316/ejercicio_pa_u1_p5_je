package com.uce.edu.matriculacion.service;

import java.util.List;

import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

public interface IVehiculoService {

	public Vehiculo buscar(String numPlaca);
	public void crear(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String numPlaca);
	
	public List<Vehiculo> buscarVehiculo();
	
}
