package az.ingress.ms15demo.model.criteria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserCriteria {
    String name;
    Integer ageFrom;
    Integer ageTo;
    String finLike;
}
