package com.nishantspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.nishantspringboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
