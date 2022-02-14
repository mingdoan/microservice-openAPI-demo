package com.example.productorderingservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
@Configuration
@Slf4j
public class RestConfig {
    @Bean
    RestTemplate restTemplate() {

        RestTemplate template = new RestTemplate();
        template.setRequestFactory(getNonStreamingBufferedRequestFactory());
        return template;
    }

    private static ClientHttpRequestFactory getNonStreamingBufferedRequestFactory() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        log.info("disable output streaming for http requests factory");
        requestFactory.setOutputStreaming(false);
        return new BufferingClientHttpRequestFactory(requestFactory);
    }
}
