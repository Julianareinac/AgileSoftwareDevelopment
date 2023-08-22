package com.uniquindio.AgileSoftwareDevelopment.web;

import com.uniquindio.AgileSoftwareDevelopment.model.Author;
import com.uniquindio.AgileSoftwareDevelopment.services.AuthorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping({"/{id}"})
    public Author getAuthorById(@PathVariable("id") Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping()
    public void createAuthor(@RequestBody Author author) {
        authorService.createAuthor(author);
    }
}
