package com.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.repository.AtomeRepository;
import com.demo.domain.entity.Atome;
import com.demo.dto.AtomeDto;
import com.demo.service.AtomeService;

/**
 * Service Layer : Implementation of {@link AtometService}
 * 
 * @author Ramroum
 *
 */
@Service
public class AtomeServiceImpl implements AtomeService {

	@Autowired
	AtomeRepository atomeRepository;

	@Autowired
	ModelMapperServiceImpl modelMapperService;

	@Override
	public List<AtomeDto> getAll() {

		final List<AtomeDto> result = new ArrayList<>();

		final Iterable<Atome> atomes = atomeRepository.findAll();

		for (Atome atome : atomes) {

			result.add(modelMapperService.map(atome, AtomeDto.class));
		}

		return result;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public AtomeDto add(AtomeDto atomeDto) {
		
		Atome atome = atomeRepository.save(modelMapperService.map(atomeDto, Atome.class));
		
		return modelMapperService.map(atome, AtomeDto.class);
		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AtomeDto findAtomeById(String id) {

		return this.findAtomeById(Long.parseLong(id));
		
	}
	
	@Override
	public AtomeDto findAtomeById(Long id) {

		Optional<Atome> atome = atomeRepository.findById(id);

		if (atome.isPresent()) {

			return (modelMapperService.map(atome.get(), AtomeDto.class));
		}

		return null;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deleteAtomeById(String id) {
		
		atomeRepository.deleteById(Long.parseLong(id));
		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AtomeDto updateAtome(AtomeDto atomeDto) {
		
		Atome atome = modelMapperService.map(atomeDto, Atome.class);
		
		atomeRepository.save(atome);
		
		return atomeDto;
	}

	

	

}
