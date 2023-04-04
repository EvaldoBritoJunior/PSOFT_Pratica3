package com.ufcg.psoft.mercadofacil.repository;

import com.ufcg.psoft.mercadofacil.model.Lote;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class VolatilLoteRepository implements LoteRepository {

   List<Lote> lotes = new ArrayList<>();

   @Override
   public Lote save(Lote lote) {
       lotes.add(lote);
       return lotes.stream().findFirst().get();
   }

   @Override
   public Lote find(Long id) {
	   return lotes.get(Integer.parseInt("" + id));
   }

   @Override
   public <S extends Lote> List<S> saveAll(Iterable<S> entities) {
      return null;
   }

   @Override
   public Optional<Lote> findById(Long aLong) {
      return Optional.empty();
   }

   @Override
   public boolean existsById(Long aLong) {
      return false;
   }

   @Override
   public List<Lote> findAll() {
	   return lotes;
   }

   @Override
   public List<Lote> findAllById(Iterable<Long> longs) {
      return null;
   }

   @Override
   public long count() {
      return 0;
   }

   @Override
   public void deleteById(Long aLong) {

   }

   @Override
   public Lote update(Lote lote) {
      lotes.clear();
      lotes.add(lote);
      return lotes.stream().findFirst().orElse(null);
   }

   @Override
   public void delete(Lote lote) {
      lotes.clear();
   }

   @Override
   public void deleteAllById(Iterable<? extends Long> longs) {

   }

   @Override
   public void deleteAll(Iterable<? extends Lote> entities) {

   }

   @Override
   public void deleteAll() {
      lotes.clear();
   }

   @Override
   public void flush() {

   }

   @Override
   public <S extends Lote> S saveAndFlush(S entity) {
      return null;
   }

   @Override
   public <S extends Lote> List<S> saveAllAndFlush(Iterable<S> entities) {
      return null;
   }

   @Override
   public void deleteAllInBatch(Iterable<Lote> entities) {

   }

   @Override
   public void deleteAllByIdInBatch(Iterable<Long> longs) {

   }

   @Override
   public void deleteAllInBatch() {

   }

   @Override
   public Lote getOne(Long aLong) {
      return null;
   }

   @Override
   public Lote getById(Long aLong) {
      return null;
   }

   @Override
   public Lote getReferenceById(Long aLong) {
      return null;
   }

   @Override
   public <S extends Lote> Optional<S> findOne(Example<S> example) {
      return Optional.empty();
   }

   @Override
   public <S extends Lote> List<S> findAll(Example<S> example) {
      return null;
   }

   @Override
   public <S extends Lote> List<S> findAll(Example<S> example, Sort sort) {
      return null;
   }

   @Override
   public <S extends Lote> Page<S> findAll(Example<S> example, Pageable pageable) {
      return null;
   }

   @Override
   public <S extends Lote> long count(Example<S> example) {
      return 0;
   }

   @Override
   public <S extends Lote> boolean exists(Example<S> example) {
      return false;
   }

   @Override
   public <S extends Lote, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
      return null;
   }

   @Override
   public List<Lote> findAll(Sort sort) {
      return null;
   }

   @Override
   public Page<Lote> findAll(Pageable pageable) {
      return null;
   }
}

