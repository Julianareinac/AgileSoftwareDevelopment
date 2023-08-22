package com.uniquindio.AgileSoftwareDevelopment.services;

import com.uniquindio.AgileSoftwareDevelopment.model.Author;

public interface AuthorService {
    Author getAuthorById(Long id);

    void createAuthor(Author author);
}
