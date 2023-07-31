package az.ingress.msdemo.util;

import az.ingress.msdemo.model.entities.User;
import az.ingress.msdemo.model.entities.dtos.GetUserResponse;

public class UserEntityMapper {
    public static GetUserResponse mapEntityToGetUserResponse(User user) {
        return GetUserResponse.builder()
                .address(user.getAddress())
                .age(user.getAge())
                .name(user.getName())
                .build();
    }
}
