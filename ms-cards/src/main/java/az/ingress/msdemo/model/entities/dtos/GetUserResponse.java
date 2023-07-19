package az.ingress.msdemo.model.entities.dtos;

import az.ingress.msdemo.model.entities.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponse {
    private String name;
    private Integer age;
    private String address;

}
