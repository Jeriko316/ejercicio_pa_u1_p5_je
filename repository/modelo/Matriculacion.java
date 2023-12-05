package com.uce.edu.matriculacion.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matriculacion {

	private Vehiculo vehiculo;
	private LocalDate fechaMatriculacion;
	private Propietario propietario;
	private BigDecimal costoMatricula;

	
	
//	getters and setters
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public BigDecimal getCostoMatricula() {
		return costoMatricula;
	}

	public void setCostoMatricula(BigDecimal costoMatricula) {
		this.costoMatricula = costoMatricula;
	}
	
	
//	tostring
	
	@Override
	public String toString() {
		return "Matriculacion [vehiculo=" + vehiculo + ", fechaMatriculacion=" + fechaMatriculacion + ", propietario="
				+ propietario + ", costoMatricula=" + costoMatricula + "]";
	}

}
