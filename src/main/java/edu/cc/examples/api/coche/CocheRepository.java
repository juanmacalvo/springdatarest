package edu.cc.examples.api.coche;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CocheRepository extends CrudRepository<Coche, Long> {

    
}