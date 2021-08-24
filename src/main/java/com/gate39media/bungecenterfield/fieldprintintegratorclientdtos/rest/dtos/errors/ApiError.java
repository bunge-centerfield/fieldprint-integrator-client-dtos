package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError {
    private static final String DATE_PATTERN = "dd-MM-yyyy hh:mm:ss";
    private Integer code;
    private String status;
    private String timestamp;
    private String message;
    private String stacktrace;
    private String path;

    public static ApiError fromHttpStatusAndMessage(final Integer code, final String status, final String message) {
        return ApiError.builder().code(code).timestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_PATTERN))).status(status).message(message).build();
    }

    public static ApiError fromHttpStatusAndMessageAndStackTrace(final Integer code, final String status, final String message, String stacktrace) {
        final ApiError error = fromHttpStatusAndMessage(code, status, message);
        error.setStacktrace(stacktrace);
        return error;
    }
}
