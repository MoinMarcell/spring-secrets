package com.github.moinmarcell.springsecrets;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("github")
public record GitHubConfigProperties(
        String oAuthUrl,
        String client_id
) {
}
