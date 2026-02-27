package com.pradeep.students_common.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    private Long studentId;

    private String firstName;

    private String middleName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String age;


    @OneToMany(mappedBy = "students", cascade = CascadeType.ALL)
    private List<Books> bookss;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<ContactInfo> contactInfos;

    @OneToMany(mappedBy = "students", cascade = CascadeType.ALL)
    private List<Alarm> alarms;

    // Additional fields can be added as needed
}