package com.uce.edu.matriculacion.repository.modelo;

import java.math.BigDecimal;

public class Vehiculo {

	private String marca;
	private String numPlaca;
	private String modelo;
	private BigDecimal precio;
	private String tipo;
	
	//getters and setters
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	//To string
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", placa=" + numPlaca + ", modelo=" + modelo + ", precio=" + precio + ", tipo="
				+ tipo + "]";
	}
	
	
}
