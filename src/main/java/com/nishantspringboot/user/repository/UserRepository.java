package com.nishantspringboot.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.nishantspringboot.user.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
