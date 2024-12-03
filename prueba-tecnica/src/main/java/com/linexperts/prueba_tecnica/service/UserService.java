package com.linexperts.prueba_tecnica.service;

import com.linexperts.prueba_tecnica.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private static final String API_URL = "https://jsonplaceholder.typicode.com/users";
    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Cacheable("users")
    public List<User> getUsers() {
        try {
            User[] users = restTemplate.getForObject(API_URL, User[].class);
            return Arrays.asList(users);
        } catch (RestClientException e) {
            logger.error("Error fetching users from API: {}", e.getMessage());
            return Collections.emptyList();
        }
    }
}
