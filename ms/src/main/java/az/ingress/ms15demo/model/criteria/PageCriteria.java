package az.ingress.ms15demo.model.criteria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageCriteria {
    Integer page;
    Integer count;
}
