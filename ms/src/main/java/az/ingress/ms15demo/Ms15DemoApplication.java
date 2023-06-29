package az.ingress.ms15demo;

import az.ingress.ms15demo.client.TestClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

@SpringBootApplication
@EnableJpaRepositories
@EnableFeignClients
@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableScheduling
public class Ms15DemoApplication {

    private final TestClient testClient;

    // TODO: Go to http://localhost:8080/swagger-ui/index.html after launching application
    public static void main(String[] args) {
        SpringApplication.run(Ms15DemoApplication.class, args);
    }

    @Scheduled(fixedDelayString = "PT30S")
    public void run() {
        System.out.println(testClient.getStatus());
    }

    @Scheduled(cron = "30 32 15 * * *") // Every day at 15:32:30
    public void getTime() {
        System.out.println(testClient.getTime());
    }

}