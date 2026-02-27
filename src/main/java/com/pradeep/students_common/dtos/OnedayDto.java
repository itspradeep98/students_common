package com.pradeep.students_common.dtos;
import com.pradeep.students_common.entities.Students;
import lombok.*;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class OnedayDto {

    private Long alarmId;
    //store student id and other details
    private Students student;
    //store alarm name
    private String alarmName;
    // store times of alarm 1 or 2
    private String noOfTimes;
    // store alarm description / reason for alarm
    private String alarmDescription;
    // store first alarm time
    private String alarmTime1;
    // store second alarm time when time is 2
    private String alarmTime2;
    // store alarm type like wakeup, reminder, etc.
    private Integer snoozeType;
    // store snooze type like 5 minutes, 10 minutes, etc.
    private LocalDateTime snoozeDuration;
    // store status of alarm like active, inactive, etc.
    private String status;

}
