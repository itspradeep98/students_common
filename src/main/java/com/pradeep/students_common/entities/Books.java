package com.pradeep.students_common.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alarm_seq")
    @SequenceGenerator(name = "book_seq", sequenceName = "book_seq", allocationSize = 1)
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
