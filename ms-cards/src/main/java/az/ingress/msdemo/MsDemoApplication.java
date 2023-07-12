package az.ingress.msdemo;

import az.ingress.msdemo.model.entities.User;
import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@SpringBootApplication
@RequestMapping("")
@RestController
public class MsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsDemoApplication.class, args);
    }

    @PostMapping("")
    public String run(@RequestBody User user) {
        return"Adding user";
    }

    @GetMapping("/cron")
    public String cronEnd() {
        return String.valueOf(new Date().getTime());
    }

}
