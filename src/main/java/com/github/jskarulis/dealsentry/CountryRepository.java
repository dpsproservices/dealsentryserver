package com.github.jskarulis.dealsentry;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	

	
}