package com.uniquindio.AgileSoftwareDevelopment.repositories;

import com.uniquindio.AgileSoftwareDevelopment.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author,Long> {

    /*@Query(value = "SELECT u FROM Author u")
    List<Author> findAllAuthors();*/
}

