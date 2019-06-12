package hello.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "hello")
@RestController
public class DemoApplication {


    @GetMapping("/")
    public String home() {
        return "hello world pipeline";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}