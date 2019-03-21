package com.intercorp.retail.microservices.clienteservice.clienteservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intercorp.retail.microservices.clienteservice.clienteservice.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}