package com.uniquindio.AgileSoftwareDevelopment.repositories;

import com.uniquindio.AgileSoftwareDevelopment.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,String> {
}
