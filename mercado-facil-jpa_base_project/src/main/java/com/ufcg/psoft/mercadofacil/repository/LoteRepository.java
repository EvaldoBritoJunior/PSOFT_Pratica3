package com.ufcg.psoft.mercadofacil.repository;

import com.ufcg.psoft.mercadofacil.model.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoteRepository extends JpaRepository<Lote, Long> {
    Lote save(Lote lote);
    Lote find(Long id);
    List<Lote> findAll();
    Lote update(Lote lote);
    void delete(Lote lote);
    void deleteAll();
}

