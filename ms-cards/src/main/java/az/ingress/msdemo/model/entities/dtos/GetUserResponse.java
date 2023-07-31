package az.ingress.msdemo.model.entities.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetUserResponse {
    private String name;
    private Integer age;
    private String address;

}
