package com.linexperts.prueba_tecnica;


import com.linexperts.prueba_tecnica.model.User;
import com.linexperts.prueba_tecnica.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTests {


    private final RestTemplate restTemplate = Mockito.mock(RestTemplate.class);
    private final UserService userService = new UserService(restTemplate);

    @Test
    void testGetUsers() {
        User mockUser = new User();
        mockUser.setId(1);
        mockUser.setName("Maickol Velasco");
        mockUser.setUsername("mvelasco");
        mockUser.setEmail("maickol@correo.com");

        when(restTemplate.getForObject(Mockito.anyString(), Mockito.eq(User[].class)))
                .thenReturn(new User[]{mockUser});

        List<User> users = userService.getUsers();

        assertEquals(1, users.size());
        assertEquals("Maickol Velasco", users.get(0).getName());
    }
}
