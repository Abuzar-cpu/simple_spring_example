package az.ingress.ms15demo.utils;

import az.ingress.ms15demo.model.GetUserResponse;
import az.ingress.ms15demo.model.PageableUserResponse;
import az.ingress.ms15demo.model.User;
import org.springframework.data.domain.Page;

public class UserMapper {

    public static GetUserResponse mapEntityToResponse(User user) {
        return GetUserResponse.builder()
                .age(user.getAge())
                .FIN(user.getFIN())
                .id(user.getId())
                .name(user.getName())
                .build();
    }

    public static PageableUserResponse mapToPageableUserResponse(Page<User> usersPage) {
        return PageableUserResponse.builder()
                .users(usersPage.getContent().stream().map(UserMapper::mapEntityToResponse).toList())
                .hasNextPage(usersPage.hasNext())
                .lastPageNumber(usersPage.getTotalPages())
                .totalElementNumber(usersPage.getNumberOfElements())
                .build();
    }
}
