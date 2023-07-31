package az.ingress.msdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RequestMapping("")
@RestController
public class MsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsDemoApplication.class, args);
    }

    @GetMapping("/cron")
    public String cronEnd() {
        return String.valueOf(new Date().getTime());
    }

}
