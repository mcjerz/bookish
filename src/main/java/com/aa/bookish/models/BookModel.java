package com.aa.bookish.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookModel {
    private static int idCounter;

    private int id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int pages;

    public BookModel toModel() {
        return BookModel.of(getTitle(),getAuthor(),getIsbn(),getPages());
    }

    public static BookModel of(final String pTitle, final String pAuthor, final String pIsbn, final int pPages)
    {
        final BookModel book = new BookModel();
        book.setId(++idCounter);
        book.setTitle(pTitle);
        book.setAuthor(pAuthor);
        book.setIsbn(pIsbn);
        book.setPages(pPages);

        return book;
    }
}
