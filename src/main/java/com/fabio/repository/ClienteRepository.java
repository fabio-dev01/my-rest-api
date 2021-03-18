package com.fabio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Cliente findById(long id);
}
