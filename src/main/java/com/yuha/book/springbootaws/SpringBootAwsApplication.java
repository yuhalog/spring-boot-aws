package com.yuha.book.springbootaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing 가 삭제됨
@SpringBootApplication
public class SpringBootAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsApplication.class, args);
    }

}
