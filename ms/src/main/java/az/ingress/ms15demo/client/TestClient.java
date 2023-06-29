package az.ingress.ms15demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "test", url = "http://localhost:8081/")
public interface TestClient {

    @GetMapping("")
    String getStatus();
}
