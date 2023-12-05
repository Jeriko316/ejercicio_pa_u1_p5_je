package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matriculacion.repository.modelo.Matriculacion;
import com.uce.edu.matriculacion.repository.modelo.Propietario;
import com.uce.edu.matriculacion.repository.modelo.Vehiculo;



@Repository
public class MatriculacionRepositoryImpl implements IMatriculacionRepository {

	private List<Matriculacion> base = new ArrayList<Matriculacion>();

	@Override
	public void matricular(Matriculacion matricula) {
		base.add(matricula);
	}


	

}
