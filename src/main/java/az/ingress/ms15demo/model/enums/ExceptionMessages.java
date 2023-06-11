package az.ingress.ms15demo.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionMessages {
    UNEXPECTED_ERROR("unexpected error occurred"),
    USER_NOT_FOUND("user not found"),
    USER_ALREADY_EXISTS("user already exists with this info"),
    METHOD_NOT_ALLOWED("Http method not supported2");

    private final String message;
}
