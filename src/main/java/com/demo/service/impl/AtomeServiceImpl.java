package com.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.repository.AtomeRepository;
import com.demo.domain.entity.Atome;
import com.demo.dto.AtomeDto;
import com.demo.exception.ServiceLayerException;
import com.demo.service.AtomeService;
import com.demo.util.MessageUtil;

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
	public AtomeDto findAtomeById(String id) throws ServiceLayerException {

		try {

			Assert.notNull(id, MessageUtil.ID_IS_REQUIRED);

			Optional<Atome> atome = atomeRepository.findById(Long.parseLong(id));

			if (atome.isPresent()) {

				return (modelMapperService.map(atome.get(), AtomeDto.class));
				
			} else {

				throw new ServiceLayerException(MessageUtil.getNotFoundMessage(MessageUtil.ATOME, id));
			}

		} catch(NumberFormatException exception) {
			
			throw new ServiceLayerException(MessageUtil.VALIDATION_NUMBER);
			
		} catch (Exception exception) {

			throw new ServiceLayerException(exception.getMessage());

		}

	}
	
	@Override
	public AtomeDto findAtomeById(Long id) throws ServiceLayerException {
		
		try {
			
			Assert.notNull(id, MessageUtil.ID_IS_REQUIRED);
			
			Optional<Atome> atome = atomeRepository.findById(id);

			if (atome.isPresent()) {

				return (modelMapperService.map(atome.get(), AtomeDto.class));
			}
			else {
				
				throw new ServiceLayerException(MessageUtil.getNotFoundMessage(MessageUtil.ATOME, id));
			}

			
		}
		catch(Exception exception) {
			
			throw new ServiceLayerException(exception.getMessage());
			
		}

		
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
