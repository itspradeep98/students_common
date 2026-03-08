package com.pradeep.students_common.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BooksDto {

    private String title;

    private String author;

    private String isbn;

    private double price;

    private int publicationYear;

    private String ShortDescription;
}
