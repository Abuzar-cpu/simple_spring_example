package az.ingress.ms15demo.services.specification;

import az.ingress.ms15demo.model.User;
import az.ingress.ms15demo.model.criteria.UserCriteria;
import az.ingress.ms15demo.model.enums.CriteriaEnums;
import az.ingress.ms15demo.utils.PredicateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.domain.Specification;

import static az.ingress.ms15demo.utils.PredicateUtil.applyLike;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserSpecification implements Specification<User> {

    private UserCriteria userCriteria;
    @Override
    public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        var predicate = PredicateUtil.builder()
                .addNullSafe(
                        userCriteria.getName(),
                        name -> criteriaBuilder.like(root.get(CriteriaEnums.NAME.getField()), applyLike(name))
                )
                .addNullSafe(
                        userCriteria.getAgeFrom(),
                        ageFrom -> criteriaBuilder.greaterThanOrEqualTo(root.get(CriteriaEnums.AGE.getField()), ageFrom)
                )
                .addNullSafe(
                        userCriteria.getAgeTo(),
                        ageTo -> criteriaBuilder.lessThanOrEqualTo(root.get(CriteriaEnums.AGE.getField()), ageTo)
                )
                .addNullSafe(
                        userCriteria.getFinLike(),
                        fin -> criteriaBuilder.like(root.get(CriteriaEnums.FIN.getField()), fin)
                )
                .build();

        return criteriaBuilder.and(predicate);
    }
}
