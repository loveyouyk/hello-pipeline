package hello.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "hello")
@RestController
public class DemoApplication {


    @GetMapping("/hello")
    public String home() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}