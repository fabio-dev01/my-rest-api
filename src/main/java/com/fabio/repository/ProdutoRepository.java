package com.fabio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
}
