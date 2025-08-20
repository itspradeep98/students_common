package com.pradeep.students_common.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    @Id
    private String StudentId;

    private String firstName;

    private String MiddleName;
    private String LastName;
    private String Email;
    private String ContactNumber;
    private String Age;


    @DBRef(lazy = true)
    private List<Books> bookss;

    @DBRef(lazy = true)
    private List<ContactInfo> contactInfos;

    // Additional fields can be added as needed
}