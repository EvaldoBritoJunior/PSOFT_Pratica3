package com.ufcg.psoft.mercadofacil.repository;

import com.ufcg.psoft.mercadofacil.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto save(Produto produto);
    Produto find(Long id);

    List<Produto> findAll();
    Produto update(Produto produto);

    void delete(Produto produto);

    void deleteAll();
}

