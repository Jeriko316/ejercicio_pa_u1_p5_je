package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matriculacion.repository.modelo.Vehiculo;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	private List <Vehiculo> base = new ArrayList<Vehiculo>();
	
	@Override
	public Vehiculo buscar(String numPlaca) {
		for (Vehiculo recorre : base) {
			if (recorre.getNumPlaca().equals(numPlaca)) {
				Vehiculo vehiculo = new Vehiculo();
				vehiculo.setMarca(vehiculo.getMarca());
				vehiculo.setModelo(vehiculo.getModelo());
				vehiculo.setPrecio(vehiculo.getPrecio());
				vehiculo.setTipo(vehiculo.getTipo());
				return vehiculo;
			}
		}
		return null;
	}

	@Override
	public void guardar(Vehiculo vehiculo) {

		base.add(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {

		this.eliminar(vehiculo.getNumPlaca());
		this.guardar(vehiculo);
		
	}

	@Override
	public void eliminar(String numPlaca) {

		Vehiculo vehiculoQuitar = this.buscar(numPlaca);
		base.remove(vehiculoQuitar);
	}

}
