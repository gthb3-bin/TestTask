package com.dev.test.dao.impl;

import com.dev.test.dao.UserRepository;
import com.dev.test.model.Car;
import com.dev.test.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> getAllUsers() {
        // imagine we get this data from db with Paginator. Passwords are stored in the database in hashed form.
        return List.of(new User(1L, "ivanov@gmail.com", "password hashed", "Ivan", "Ivanov",
                        List.of(new Car(1L, "Fabia", "Skoda", 2010, "KA 0000 BA"))),
                new User(2L, "petrova@gmail.com", "password hashed", "Olga", "Petrova",
                        List.of(new Car(2L, "X5", "BMW", 2015, "KA 0001 BA"),
                                new Car(3L, "6", "Mazda", 2011, "KA 0002 BA"),
                                new Car(4L, "Mini Cooper", "Country", 2020, "KA 0003 BA"))),
                new User(3L, "bogdan@gmail.com", "password hashed", "Iryna", "Bogdan",
                        List.of(new Car(5L, "Vitara", "Suzuki", 2019, "KA 0004 BA"),
                                new Car(6L, "Corolla", "Toyota", 2017, "KA 0005 BA"))),
                new User(4L, "chleb@gmail.com", "password hashed", "Oleg", "Chleb",
                        List.of(new Car(7L, "Sportage", "Kia", 2019, "KA 0006 BA"))),
                new User(5L, "sidorov@gmail.com", "password hashed", "Max", "Sidorov", null));
    }
}
