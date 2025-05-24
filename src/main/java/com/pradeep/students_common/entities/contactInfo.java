package com.pradeep.students_common.entities;

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
public class contactInfo {

    private String Id;

    @DBRef
    private students Student;

    private String First_Name;
    private String Middle_Name;
    private String Last_Name;
    private List<String> contact_Numbers;
    private String Email;
    private String Feild;

}