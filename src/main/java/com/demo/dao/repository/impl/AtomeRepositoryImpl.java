package com.demo.dao.repository.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.demo.dao.repository.AtomeRepository;
import com.demo.domain.entity.Atome;

public class AtomeRepositoryImpl implements AtomeRepository {

	@Override
	public Iterable<Atome> findAll(Sort sort) {

		return this.findAll(sort);
	}

	@Override
	public Page<Atome> findAll(Pageable pageable) {
		return this.findAll(pageable);
	}

	@Override
	public <S extends Atome> S save(S entity) {
		return this.save(entity);
	}

	@Override
	public <S extends Atome> Iterable<S> saveAll(Iterable<S> entities) {
		return this.saveAll(entities);
	}

	@Override
	public Optional<Atome> findById(Long id) {
		return this.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return this.existsById(id);
	}

	@Override
	public Iterable<Atome> findAll() {
		return this.findAll();
	}

	@Override
	public Iterable<Atome> findAllById(Iterable<Long> ids) {
		return this.findAllById(ids);
	}

	@Override
	public long count() {
		return this.count();
	}

	@Override
	public void deleteById(Long id) {
		this.deleteById(id);

	}

	@Override
	public void delete(Atome entity) {
		this.delete(entity);

	}

	@Override
	public void deleteAll(Iterable<? extends Atome> entities) {
		this.deleteAll(entities);

	}

	@Override
	public void deleteAll() {
		this.deleteAll();

	}

}
