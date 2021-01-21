package com.demo.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.demo.domain.entity.Atome;

/**
 * DAO Layer
 * An {@link Atome} Repository that supports Pagination and sorting in addition to CRUD operations 
 * @author Ramroum
 *
 */
@RepositoryRestResource (collectionResourceRel = "atomes", path = "atomes") 
public interface AtomeRepository  extends PagingAndSortingRepository<Atome, Long>{
	

}
