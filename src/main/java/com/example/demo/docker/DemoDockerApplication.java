package com.example.demo.docker;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoDockerApplication implements CommandLineRunner {

    @Value("${server.port}")
    private int serverPort;

    public static void main(String[] args) {
        SpringApplication.run(DemoDockerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("(run) server running in {}", serverPort);
        log.info("(run) is empty {}", StringUtils.isEmpty("Xin chao"));
    }
}
