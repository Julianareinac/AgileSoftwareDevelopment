package com.uniquindio.AgileSoftwareDevelopment.web;

import com.uniquindio.AgileSoftwareDevelopment.model.Author;
import com.uniquindio.AgileSoftwareDevelopment.model.Book;
import com.uniquindio.AgileSoftwareDevelopment.services.AuthorService;
import com.uniquindio.AgileSoftwareDevelopment.services.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping({"/{id}"})
    public Book getAuthorById(@PathVariable("id") String id) {
        return bookService.getBookById(id);
    }

    @PostMapping()
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }
}
