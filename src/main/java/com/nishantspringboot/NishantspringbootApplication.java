package com.nishantspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nishantspringboot.user.entity.User;
import com.nishantspringboot.user.repository.UserRepository;

@SpringBootApplication
public class NishantspringbootApplication {

	public static void main(String[] args) {
	ApplicationContext	context = SpringApplication.run(NishantspringbootApplication.class, args);
	
	UserRepository userRespository = context.getBean(UserRepository.class);
	
	User user = new User();
	user.setCity("Delhi");
	user.setName("Nishant");
	user.setStatus("I am Java Programmer");
	
	User user1 = userRespository.save(user);
	System.out.println(user1);
	}

}
