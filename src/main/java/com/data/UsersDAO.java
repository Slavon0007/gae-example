package com.data;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {

    public List<User> getAll() {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setEmail("slava.dev." + i + "gmail.com");
            user.setPassword("pswd");
            user.setName("Slava " + i);

            users.add(user);
        }

        return users;
    }
}
