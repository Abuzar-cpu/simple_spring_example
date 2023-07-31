package az.ingress.msdemo.model.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessages {
    INTERNAL_SERVER_ERROR("internal server error occurred"),
    NOT_FOUND("not found");
   private final String message;
}
