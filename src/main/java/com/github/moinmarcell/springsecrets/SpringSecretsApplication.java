package com.github.moinmarcell.springsecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@EnableConfigurationProperties(GitHubConfigProperties.class)

public class SpringSecretsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecretsApplication.class, args);
    }

}
