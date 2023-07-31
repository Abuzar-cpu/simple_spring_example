package az.ingress.msdemo.exceptions;

import az.ingress.msdemo.model.entities.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static az.ingress.msdemo.model.entities.enums.ErrorMessages.INTERNAL_SERVER_ERROR;

@RestControllerAdvice
@Component
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception e) {
        log.error("Error occurred: ", e);
        return new ErrorResponse(INTERNAL_SERVER_ERROR.getMessage());
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleException(NotFoundException e) {
        return new ErrorResponse(e.getMessage());
    }


}
