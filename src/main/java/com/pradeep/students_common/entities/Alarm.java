package com.pradeep.students_common.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@Document(collection = "alarms")
public class Alarm {

    @Id
    private String id;

    @DBRef
    private students students;

    private String alarmName;

    private String noOfTimes;

    private String alarmDescription;

    private LocalDateTime alarmTime1;

    private LocalDateTime alarmTime2;

    private String alarmType;

    private String repeatType;

    private List<String> repeatDays;

    private Integer snoozeType;

    private LocalDateTime RingTime;

    private LocalDateTime snoozeDuration;

    private String status;

}
