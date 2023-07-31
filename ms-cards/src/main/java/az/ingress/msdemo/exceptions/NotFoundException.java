package az.ingress.msdemo.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
