package com.demo.service;

import java.util.List;

import com.demo.domain.entity.Atome;
import com.demo.dto.AtomeDto;
import com.demo.exception.ServiceLayerException;

/**
 * Service Layer : exposing {@link AtomeDto}
 * 
 * @author Ramroum
 *
 */
public interface AtomeService {

	/**
	 * Fetchs all {@link Atome} from database, maps them to a list of
	 * {@link AtomeDto} and returns it
	 * 
	 * @return list of atomes
	 */
	public List<AtomeDto> getAll();
	
	/**
	 * Save a new {@link Atome} in the database
	 */
	public AtomeDto add(AtomeDto atomeDto);
	
	/**
	 * Fetch a single {@link Atome} from database from its id
	 * 
	 * @param id
	 * @return one AtomeDto
	 */

	public AtomeDto findAtomeById(String id) throws ServiceLayerException;
	public AtomeDto findAtomeById(Long id)   throws ServiceLayerException;

	/**
	 * Delete a single {@link Atome} from database from its id
	 * 
	 * @param id
	 * @return boolean
	 */
	public void deleteAtomeById(String id);
	
	/**
	 * Update an {@link Atome} in database 
	 * @param atomeDto
	 * @return
	 */
	public AtomeDto updateAtome(AtomeDto atomeDto);
}
