package com.pradeep.students_common.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_seq")
    @SequenceGenerator(name = "contact_seq", sequenceName = "contact_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    private Students student;

    private String firstName;
    private String middleName;
    private String lastName;
    @ElementCollection
    private List<String> contactNumbers;
    private String email;
    private String field;

}