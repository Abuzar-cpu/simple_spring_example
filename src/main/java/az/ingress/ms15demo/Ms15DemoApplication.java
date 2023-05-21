package az.ingress.ms15demo;

import az.ingress.ms15demo.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Ms15DemoApplication {

    // TODO: Go to http://localhost:8080/swagger-ui/index.html after launching application
    // TODO: Database will be preloaded with mock data

    public static void main(String[] args) {
        SpringApplication.run(Ms15DemoApplication.class, args);
    }

    @PostConstruct
    public void preloadDb() {
        UserRepository.preload();

        log.info("Database loaded");
    }

}
