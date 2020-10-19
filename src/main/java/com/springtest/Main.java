package com.springtest;

import com.springtest.config.AppConfig;
import com.springtest.model.User;
import com.springtest.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User userBob = new User("bob123@Gmail.com", "bob_pass");
        User userAlice = new User("alice123@Gmail.com", "alice_pass");
        System.out.println("Created users:");
        System.out.println(userBob + "\n" + userAlice);
        userService.add(userBob);
        userService.add(userAlice);
        System.out.println("Users from DB:");
        userService.listUsers().forEach(System.out::println);
    }
}
