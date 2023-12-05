package com.uce.edu.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matriculacion.repository.IPropietarioRepository;
import com.uce.edu.matriculacion.repository.IVehiculoRepository;
import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

@Service
public class MatriculacionServiceImpl implements IMatriculacionService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	
	@Override
	public void matricular(String numPlaca, String propietario) {

		iVehiculoRepository.buscar(numPlaca);

		
	}

	
}


package com.example.demo.service;

public interface MatricularService {

	
	public void matriculacion(String identificacion,String placa);
	
}


package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatricularRepository;
import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Matricular;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatricularServiceImpl implements MatricularService{
@Autowired
private MatricularRepository matricularRepository;
@Autowired
private PropietarioRepository propietarioRepository;

@Autowired
private VehiculoRepository repository;
	@Override
	public void matriculacion(String identificacion, String placa) {
		// TODO Auto-generated method stub
		Propietario propietario= this.propietarioRepository.encontrar(identificacion);
		Vehiculo vehiculo= this.repository.encontrar(placa);
		Matricular matricular= new Matricular();
		matricular.setPropietario(propietario);
		matricular.setVehiculo(vehiculo);
		matricular.setFechaDeMatricula(LocalDate.now());
		BigDecimal valorMatricula= null;
		
		if(vehiculo.getTipo().equals("manual")) {
			valorMatricula= vehiculo.getPrecio().multiply(new BigDecimal(0.10));
			
			
		}else {
			valorMatricula= vehiculo.getPrecio().multiply(new BigDecimal(0.15));
			
		}if(valorMatricula.compareTo(new BigDecimal(3000))>0) {
			BigDecimal descuento= valorMatricula.multiply(new BigDecimal(0.09));
			valorMatricula=valorMatricula.subtract(descuento);
			
		}
			
			
		matricular.setValorDeMatricula(valorMatricula);
		this.matricularRepository.matricula(matricular);
		System.out.println(matricular);
		
		
		
		
		
		
		
	}

}



package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {

	public void agregar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public Propietario buscar(String identificacion);
	public void borrar(String identificacion);
	public List<Propietario> buscarTodos();
	
}


package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;
@Service
public class PropietarioServiceImpl implements PropietarioService{
@Autowired
private PropietarioRepository propietarioRepository;
	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.encontrar(identificacion);
	}

	@Override
	public void borrar(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(identificacion);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscarTodos()
				;
	}

}



package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;
@Service
public class PropietarioServiceImpl implements PropietarioService{
@Autowired
private PropietarioRepository propietarioRepository;
	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.encontrar(identificacion);
	}

	@Override
	public void borrar(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(identificacion);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscarTodos()
				;
	}

}



package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;
@Service
public class VehiculoServiceImpl implements VehiculoService{
@Autowired
private VehiculoRepository repository;
	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.repository.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.repository.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.repository.encontrar(placa);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.repository.eliminar(placa);
	}

	@Override
	public List<Vehiculo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.repository.buscarTodos();
	}

}



package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Matricular;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.MatricularService;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4AqApplication implements CommandLineRunner{
@Autowired
private VehiculoService service;
@Autowired
private PropietarioService propietarioService;
@Autowired
private MatricularService matricularService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMarca("MAZDA");
		vehiculo.setModelo("DEPORTIVO");
		vehiculo.setPlaca("1721");
		vehiculo.setPrecio(new BigDecimal(400));
		//1 crear un vehiculo
		vehiculo.setTipo("automatico");
		this.service.agregar(vehiculo);
		vehiculo.setMarca("LAMBORGINI");
		vehiculo.setModelo("CARRERAS");
		//2 actualizar un vehiculo
		this.service.actualizar(vehiculo);
		//revision
		this.service.buscarTodos().stream().forEach(System.out::println);
		//3. crear un propietario
		
		Propietario propietario= new Propietario();
		propietario.setNombre("Anddy");
		propietario.setApellido("Quisilema");
		propietario.setIdentificacion("30500");
		propietario.setFechaDeNacimiento(LocalDate.of(2000, 07, 19));
		
		this.propietarioService.agregar(propietario);
		
		this.propietarioService.buscarTodos().stream().forEach(System.out::println);
		
		
		//4.realizar una matricula
	
		this.matricularService.matriculacion(propietario.getIdentificacion(), vehiculo.getPlaca());
		
		
	}

}


