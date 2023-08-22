package com.uniquindio.AgileSoftwareDevelopment.services;

import com.uniquindio.AgileSoftwareDevelopment.model.Book;

public interface BookService {
    Book getBookById(String id);

    void createBook(Book book);
}
