package com.aa.bookish.controllers;

import com.aa.bookish.dtos.BookDTO;
import com.aa.bookish.models.BookModel;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class BookController {

//    move to service class
    private final Map<Integer, BookModel> books = new HashMap<>();


    @PostMapping("/")
    public BookDTO create(
//            @RequestHeader("authorization") final String pAuthn,
            @RequestBody final BookDTO pDTO)
    {
        final BookModel model = pDTO.toModel();
        books.put(model.getId(), model);

        return BookDTO.of(model);
    }

    @GetMapping("/")
    public Collection<BookDTO> getAll() {
        return books.values().stream()
                .map(BookDTO::of)
                .collect(Collectors.toList());
    }
}
