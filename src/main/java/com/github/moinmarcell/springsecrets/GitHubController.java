package com.github.moinmarcell.springsecrets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/github")
public class GitHubController {


    GitHubConfigProperties gitHubConfigProperties;

    public GitHubController(GitHubConfigProperties gitHubConfigProperties) {
        this.gitHubConfigProperties = gitHubConfigProperties;
    }

    @GetMapping
    public Map<String, String> getInfos(){
        return Map.of(
                "url", gitHubConfigProperties.oAuthUrl(),
                "client_id", gitHubConfigProperties.client_id()
        );
    }

}
