package az.ingress.ms15demo.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import jakarta.persistence.criteria.Predicate;

public class PredicateUtil {
    private final List<Predicate> predicateList = new ArrayList<>();
    public static PredicateUtil builder() {
        return new PredicateUtil();
    }

    public <T> PredicateUtil add (T object, Function<T, Predicate> function) {
        predicateList.add(function.apply(object));
        return this;
    }

    public <T> PredicateUtil addNullSafe(T object, Function<T, Predicate> function) {
        if(object != null)
            predicateList.add(function.apply(object));

        return this;
    }

    public static String applyLike(String key) {
        return "%" + key + "%";
    }

    public Predicate[] build() {
        return this.predicateList.toArray(new Predicate[0]);
    }
}
