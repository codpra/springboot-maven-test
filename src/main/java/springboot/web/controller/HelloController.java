package springboot.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.domain.User;

@RestController
public class HelloController {

	@GetMapping("/user")
	public User getUser() {
		User user = new User();
		user.setName("刘德财");
		user.setAge(24);
		user.setId("123-dsa-323");
		return user;
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			User user = new User();
			user.setName(RandomStringUtils.random(6));
			user.setAge(new Random().nextInt((30 - 20) + 1) + 20);
			user.setId(RandomStringUtils.random(6).toString());
			users.add(user);
		}
		return users;
	}

	@GetMapping
	public String hello() {
		return "Hello Maven.";
	}

}
