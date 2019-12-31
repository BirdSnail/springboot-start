package com.birdsnail.springboot.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author BirdSnail
 * @date 2019/12/16
 */
@EnableJpaRepositories("com.birdsnail.springboot.training.repository")
@EntityScan("com.birdsnail.springboot.training.model")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
