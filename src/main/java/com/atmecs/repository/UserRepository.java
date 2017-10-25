package com.atmecs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atmecs.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findOneByName(String name);
}
