package edu.cc.examples.api.asignatura;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {
    
    // CRUD:  Create / Read / Update / Delete  --> HTTP:    POST / GET / PUT / DELETE

	// ya temdriamos los prinicpales métodos CRUD
	// y más adelante podemos crear nuestros propios métodos

}