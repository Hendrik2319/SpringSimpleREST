package net.schwarzbaer.java.spring.simplerest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, CrudRepository<Person,Long> {

	@RestResource(path = "lastnames", rel = "lastnames")
	List<Person> findByLastName(@Param("name") String name);

}
