package az.ingress.ms15demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
@Configuration
public class Ms15DemoApplication {

    // TODO: Go to http://localhost:8080/swagger-ui/index.html after launching application
    public static void main(String[] args) {
        SpringApplication.run(Ms15DemoApplication.class, args);
    }


}
