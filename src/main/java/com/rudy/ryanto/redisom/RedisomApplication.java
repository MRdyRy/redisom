package com.rudy.ryanto.redisom;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableRedisDocumentRepositories
@EnableSwagger2
@SpringBootApplication
public class RedisomApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisomApplication.class, args);
	}

}
