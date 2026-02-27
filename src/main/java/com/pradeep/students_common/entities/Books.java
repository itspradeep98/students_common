package com.pradeep.students_common.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    @Id
    private String id;

    @ManyToOne
    private Students students;

    private String title;

    private String author;

    private String isbn;

    private double price;

    private int publicationYear;

    private String ShortDescription;

}
