package com.pradeep.students_common.exceptions;

import java.net.http.HttpResponse;


public class ApiException extends Exception {

    private  String message;
    private HttpResponse response;

    public ApiException(String message) {
        super(message);
        this.message = message;
    }
}
