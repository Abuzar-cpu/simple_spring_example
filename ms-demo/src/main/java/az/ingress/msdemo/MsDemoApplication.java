package az.ingress.msdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("")
@RestController
public class MsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDemoApplication.class, args);
	}

	@PostConstruct
	@GetMapping("")
	public String run() {
		return "You've reached here using feign. Congrats!";
	}

}
