package com.students.common.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class books {
    @Id
    private String id;

    private String title;

    private String author;

    private String isbn;

    private double price;

    private int publicationYear;

    private String ShortDescription;

}
