package ua.shpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
//////////
@EnableScheduling
@SpringBootApplication
public class CrmSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmSystemApplication.class, args);
    }

}
