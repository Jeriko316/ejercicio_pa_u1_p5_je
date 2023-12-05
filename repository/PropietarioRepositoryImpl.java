package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.expression.spel.ast.QualifiedIdentifier;
import org.springframework.stereotype.Repository;

import com.uce.edu.matriculacion.repository.modelo.Propietario;
import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	private List <Propietario>  base = new ArrayList<Propietario>();
	
	@Override
	public Propietario buscar(String identificacion) {

		for (Propietario recorre : base) {
			if (recorre.getIdentificacion().equals(identificacion)) {
				Propietario persona = new Propietario();
				persona.setNombre(persona.getNombre());
				persona.setApellido(persona.getApellido());
				persona.setFechaNacimiento(persona.getFechaNacimiento());
				persona.setIdentificacion(persona.getIdentificacion());
				return persona;
			}
		}
	
		return null;
	}

	@Override
	public void crear(Propietario propietario) {
		base.add(propietario);
	}

	@Override
	public void eliminar(String identificacion) {
		Propietario personaEliminar = this.buscar(identificacion);
	    base.remove(personaEliminar);
		
	}

	@Override
	public List<Propietario> buscarPropietarios() {
		return base;
	}

}
