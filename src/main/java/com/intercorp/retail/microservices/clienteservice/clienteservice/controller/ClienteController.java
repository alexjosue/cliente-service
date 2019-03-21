package com.intercorp.retail.microservices.clienteservice.clienteservice.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.intercorp.retail.microservices.clienteservice.clienteservice.model.Cliente;
import com.intercorp.retail.microservices.clienteservice.clienteservice.model.KpiClientes;
import com.intercorp.retail.microservices.clienteservice.clienteservice.repository.ClienteRepository;
import com.intercorp.retail.microservices.clienteservice.clienteservice.util.Util;


@RestController
public class ClienteController {

	private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	private ClienteRepository clienteRepository;

	
	@PostMapping("/creacliente")
	public ResponseEntity<Object> crearCliente(@Valid @RequestBody Cliente cliente){
		logger.info("Cliente a crear:"+cliente.toString());
		Cliente savedCliente = clienteRepository.save(cliente);
		
		URI location = ServletUriComponentsBuilder
		.fromCurrentRequest()
		.path("/{id}")
		.buildAndExpand(savedCliente.getId())
		.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/listclientes")
	public List<Cliente> obtenerListaClientesCalc(){
		logger.info("Listado de Clientes");
		List<Cliente> listaClientes = clienteRepository.findAll();
		
		for(Cliente cliente : listaClientes){
			cliente.setFechaDeceso(Util.calcularFechaDeceso(cliente));
		}
		
		return listaClientes;
	}

	@GetMapping("/kpideclientes")
	public KpiClientes obtenerKpiClientes(){
		logger.info("Obtener KPI de clientes");
		
		KpiClientes kpiClientes = new KpiClientes();
		List<Cliente> listaClientes = clienteRepository.findAll();

		kpiClientes.setPromedioEdad(Util.calcularPromedio(Util.obtenerListaEdad(listaClientes)));
		kpiClientes.setDesviacionEstandar(Util.calcularDesviacionEstandar(Util.obtenerListaEdad(listaClientes)));
				
		return kpiClientes;
	}
	
}