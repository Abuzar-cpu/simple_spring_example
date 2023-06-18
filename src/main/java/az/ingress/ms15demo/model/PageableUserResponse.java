package az.ingress.ms15demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageableUserResponse {
    private List<GetUserResponse> users;
    private int lastPageNumber;
    private int totalElementNumber;
    private boolean hasNextPage;
}
