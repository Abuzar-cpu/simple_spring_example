package az.ingress.ms15demo.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CriteriaEnums {

    AGE("age"),
    NAME("name"),
    FIN("finLike");

    private final String field;
}
