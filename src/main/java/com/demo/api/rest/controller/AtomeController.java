package com.demo.api.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.demo.domain.entity.Atome;
import com.demo.dto.AtomeDto;
import com.demo.service.AtomeService;
import com.demo.util.MessageUtil;

/**
 * Exposing a REST API for {@link Atome}
 * 
 * @author Ramroum
 *
 */
@RestController
@RequestMapping(path = "/api", produces = "application/json")
public class AtomeController {
	@Autowired
	AtomeService atomeService;

	/**
	 * Fetching all records of {@link Atome} from database and expose them as DTOs 
	 * @return 
	 */
	@GetMapping("/atome/all")
	public ResponseEntity<List<AtomeDto>> findAll() {
		
		try {
			
			return new ResponseEntity<>(atomeService.getAll(), HttpStatus.OK);
			
		} catch (Exception ex) {

			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, MessageUtil.INTERNAL_SERVER_ERROR, ex);
		}

	}

	/**
	 * Fetching a single {@link Atome} with a given ID
	 * @param id
	 * @return
	 */
	@GetMapping("/atome/{id}")
	public ResponseEntity<AtomeDto> findById(@PathVariable String id) {
		try {

			Assert.notNull(id, MessageUtil.ID_IS_REQUIRED);
			
			AtomeDto atomeDto = atomeService.findAtomeById(id);

			if (atomeDto == null) {

				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Atome with id=\"" + id + "\" does not exist");
			} else {

				return new ResponseEntity<>(atomeDto, HttpStatus.OK);
			}

		} catch (Exception ex) {

			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, MessageUtil.INTERNAL_SERVER_ERROR, ex);
		}
	}

	/**
	 * Adding a new {@link Atome} in the database from a JSON object 
	 * @param atomeDto
	 * @return
	 */
	@PostMapping("/atome/add")
	public ResponseEntity<AtomeDto> add(@Valid @RequestBody  AtomeDto atomeDto) {

		try {
			
			Assert.notNull(atomeDto.getId(), "An id is required");
			
			return new ResponseEntity<>(atomeService.add(atomeDto), HttpStatus.OK);

		} catch (Exception ex) {

			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, MessageUtil.INTERNAL_SERVER_ERROR, ex);
		}

	}

	/**
	 * Updating an existing {@link Atome} from a JSON object
	 * @param atomeDto
	 * @return
	 */
	@PutMapping("/atome/update")
	public ResponseEntity<AtomeDto> update(@Valid @RequestBody AtomeDto atomeDto) {
		
		try {
			
			AtomeDto atome = atomeService.findAtomeById(atomeDto.getId());

			Assert.isNull(atome, MessageUtil.getNotFoundMessage(MessageUtil.ATOME, atomeDto.getId()));
			
			AtomeDto updatedAtome = atomeService.updateAtome(atomeDto);

			return new ResponseEntity<>(updatedAtome, HttpStatus.OK);

		} catch (Exception ex) {

			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, MessageUtil.INTERNAL_SERVER_ERROR, ex);
			
		}

	}

	/**
	 * Deleting an {@link Atome} from a given id  
	 * @param id
	 * @return
	 */
	@DeleteMapping("/atome/delete/{id}")
	public ResponseEntity<Boolean> deleteById(@PathVariable String id) {
		
		try {

			Assert.notNull(id, MessageUtil.ID_IS_REQUIRED);
			
			atomeService.deleteAtomeById(id);

			AtomeDto atome = atomeService.findAtomeById(id);
			
			Assert.notNull(atome, MessageUtil.getNotDeletedMessage(MessageUtil.ATOME, id));

			return new ResponseEntity<>(true, HttpStatus.OK);
			

		} catch (Exception ex) {

			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, MessageUtil.INTERNAL_SERVER_ERROR, ex);

		}
	}

}
