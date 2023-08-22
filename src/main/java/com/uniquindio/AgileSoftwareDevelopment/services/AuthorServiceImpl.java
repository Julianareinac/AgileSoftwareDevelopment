package com.uniquindio.AgileSoftwareDevelopment.services;

import com.uniquindio.AgileSoftwareDevelopment.model.Author;
import com.uniquindio.AgileSoftwareDevelopment.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }

    @Override
    public void createAuthor(Author author) {
        authorRepository.save(author);
    }
}
