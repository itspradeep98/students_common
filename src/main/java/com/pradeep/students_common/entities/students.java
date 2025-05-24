package com.pradeep.students_common.entities;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class students {
    @Id
    private String StudentId;

    private String firstName;

    private String MiddleName;
    private String LastName;
    private String Email;
    private String ContactNumber;
    private String Age;


    @DBRef(lazy = true)
    private List<books> bookss;

    @DBRef(lazy = true)
    private List<contactInfo> contactInfos;

    // Additional fields can be added as needed
}