package com.pradeep.students_common.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Data
public class StudentResponse {
    private String message;
    private HttpStatus status;
    private Object data;
}
