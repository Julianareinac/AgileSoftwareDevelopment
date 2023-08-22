package com.uniquindio.AgileSoftwareDevelopment.services;

import com.uniquindio.AgileSoftwareDevelopment.model.Book;
import com.uniquindio.AgileSoftwareDevelopment.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {


    private BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(String id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }
}
