package com.liqi.springbootkisso;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class SpringbootKissoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKissoApplication.class, args);

        log.info("master");

        log.info("dev-test");

        log.info("master-dev2.0");

        log.info("dev2.0-test");
    }

}
