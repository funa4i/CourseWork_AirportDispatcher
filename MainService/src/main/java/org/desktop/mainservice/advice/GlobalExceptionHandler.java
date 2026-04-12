package org.desktop.mainservice.advice;

import jakarta.validation.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({
            ValidationException.class,
            IllegalArgumentException.class,
            Exception.class
    })
    public ResponseEntity<?> handleException(Exception e) {

//        var authentication = SecurityContextHolder.getContext().getAuthentication();
//        // authentication можно использовать при необходимости
//
//        ExceptionResponse response = new ExceptionResponse(
//                e.getMessage() != null ? e.getMessage() : "",
//                ExceptionMessage.VALIDATION_ERROR,
//                LocalDateTime.now(ZoneOffset.UTC)
//        );

        return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
    }
}
