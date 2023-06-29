package az.ingress.ms15demo;

import az.ingress.ms15demo.client.TestClient;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableFeignClients
@Slf4j
@Configuration
@RequiredArgsConstructor
public class Ms15DemoApplication {

    private final TestClient testClient;

    // TODO: Go to http://localhost:8080/swagger-ui/index.html after launching application
    public static void main(String[] args) {
        SpringApplication.run(Ms15DemoApplication.class, args);
    }

    @PostConstruct
    public void run() {
        System.out.println(testClient.getStatus());
    }

}
