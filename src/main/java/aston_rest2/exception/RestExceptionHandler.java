package aston_rest2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    private ResponseEntity<UserErrorResponse> userNotFoundException(UserNotFoundException e){
        return new ResponseEntity<>(
                new UserErrorResponse("User with this id wasn't found !", System.currentTimeMillis()),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(BadRequestException.class)
    private ResponseEntity<UserErrorResponse> badRequestException(BadRequestException e){
        return new ResponseEntity<>(
                new UserErrorResponse("Invalid query to the site", System.currentTimeMillis()),
                HttpStatus.BAD_REQUEST
        );
    }
}
