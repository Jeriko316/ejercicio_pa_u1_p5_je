package com.uce.edu.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;

public class MatriculacionServiceImpl implements IMatriculacionService {

	@Override
	public void matricular(String numPlaca, String propietario) {
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub
				//1.buscar Cta Origen
				Vehiculo ctaOrigen = this.bancariaRepository.seleccionar(numeroOrigen);
				//2.Consultar el saldo
				BigDecimal saldoOrigen = ctaOrigen.getSaldo();
				//3.Validar el saldo
				if(saldoOrigen.compareTo(monto)>=0) {  //consultar el comporeTo
					//4.Restar el monto
					BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
					//5. Actualizar la cuenta origen
					ctaOrigen.setSaldo(nuevoSaldoOrigen);
					this.bancariaRepository.actualizar(ctaOrigen);
					
					//6.Buscar Cta destino
					CuentaBancaria ctaDestino = this.bancariaRepository.seleccionar(numeroDestino);
					//7.Consultar saldo
					BigDecimal saldoDestino = ctaDestino.getSaldo();
					//8. Sumar el monto
					BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
					//9. Actualizar Cta Destino
					ctaDestino.setSaldo(nuevoSaldoDestino);
					this.bancariaRepository.actualizar(ctaDestino);
					//10. Crear la transferencia
					Transferencia transferencia = new Transferencia();
					transferencia.setCuentaOrigen(ctaOrigen);
					transferencia.setCuentaDestino(ctaDestino);
					transferencia.setFecha(LocalDateTime.now());
					transferencia.setMonto(monto);
					transferencia.setNumero("123456"); //este numero sea obtenido 
					
					transferencia.setContador(1);
					
					
					
					this.ITransferenciaRepository.insertar(transferencia);
					System.out.println("transferencia realizada con Exito" + ", Numero de tranferencia: "+ transferencia.getContador());
				}else {
					System.out.println("Saldo NO disponible");
				}
	}

}
