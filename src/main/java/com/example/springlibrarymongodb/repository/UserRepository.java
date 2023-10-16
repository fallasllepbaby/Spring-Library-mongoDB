package com.example.springlibrarymongodb.repository;

import com.example.springlibrarymongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
