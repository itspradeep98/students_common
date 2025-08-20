package com.pradeep.students_common.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    @Id
    private String id;

    @DBRef
    private Students students;

    private String title;

    private String author;

    private String isbn;

    private double price;

    private int publicationYear;

    private String ShortDescription;

}
