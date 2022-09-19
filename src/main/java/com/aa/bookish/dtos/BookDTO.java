package com.aa.bookish.dtos;

import com.aa.bookish.models.BookModel;
import lombok.Data;

@Data
public class BookDTO {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int pages;

    public BookModel toModel() {return BookModel.of(getTitle(), getAuthor(), getIsbn(), getPages());}

    public BookModel toModel(final int pId) {return BookModel.of(getTitle(), getAuthor(), getIsbn(), getPages());}

    public static BookDTO of(final BookModel pModel) {
        final BookDTO dto = new BookDTO();
        dto.setId(pModel.getId());
        dto.setTitle(pModel.getTitle());
        dto.setAuthor(pModel.getAuthor());
        dto.setIsbn(pModel.getIsbn());
        dto.setPages(pModel.getPages());

        return dto;
    }
}
