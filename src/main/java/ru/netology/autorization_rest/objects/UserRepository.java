package ru.netology.autorization_rest.objects;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

import static ru.netology.autorization_rest.objects.Authorities.*;

@Repository
public class UserRepository {

    private List<User> users = Arrays.asList(
            new User("user1", "123", Arrays.asList(READ, WRITE, DELETE)),
            new User("user2", "456", Arrays.asList(READ, WRITE)),
            new User("user3", "789", Arrays.asList(READ))
    );

    public List<Authorities> getUserAuthorities(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user.getAuthorities();
            }
        }
        return null;
    }
}
