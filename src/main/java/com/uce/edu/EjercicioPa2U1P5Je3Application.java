package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.matriculacion.repository.modelo.Propietario;
import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

@SpringBootApplication
public class EjercicioPa2U1P5Je3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPa2U1P5Je3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMarca("susuki");
		vehiculo.setModelo("sport");
		vehiculo.setNumPlaca("1234");
		vehiculo.setPrecio(new BigDecimal(120));
		//1 creamos un vehiculo
		vehiculo.setTipo("pesado");
		
		
		vehiculo.setMarca("kia");
		vehiculo.setModelo("sedan");
		
		
	
		
		Propietario propietario= new Propietario();
		propietario.setNombre("carlos");
		propietario.setApellido("suntaxig");
		propietario.setIdentificacion("12222");
		propietario.setFechaNacimiento("2000-04-6");
		
		
		
		
		//4.realizar una matricula
	
		
		
		
	}
}