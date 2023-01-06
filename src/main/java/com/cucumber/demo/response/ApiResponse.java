package com.cucumber.demo.response;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class ApiResponse extends ResponseEntity {
    public ApiResponse(HttpStatusCode status) {
        super(status);
    }

    public ApiResponse(Object body, HttpStatusCode status) {
        super(body, status);
    }

    public ApiResponse(MultiValueMap headers, HttpStatusCode status) {
        super(headers, status);
    }

    public ApiResponse(Object body, MultiValueMap headers, HttpStatusCode status) {
        super(body, headers, status);
    }

    public ApiResponse(Object body, MultiValueMap headers, int rawStatus) {
        super(body, headers, rawStatus);
    }
}
