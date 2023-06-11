package az.ingress.ms15demo.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static az.ingress.ms15demo.model.enums.ExceptionMessages.*;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handle(Exception e) {
        log.error("Exception: {}", e.getMessage());

        return new ErrorResponse(UNEXPECTED_ERROR.getMessage());
    }

    @ExceptionHandler(NotFoundException.class)

    // TODO: explore error types and use cases
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleNotFound(NotFoundException e) {
        return new ErrorResponse(USER_NOT_FOUND.getMessage());
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleNotFound(UserAlreadyExistsException e) {
        return new ErrorResponse(USER_ALREADY_EXISTS.getMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public ErrorResponse handleNotFound(HttpRequestMethodNotSupportedException e) {
        return new ErrorResponse(METHOD_NOT_ALLOWED.getMessage());
    }

}
