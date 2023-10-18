package com.example.springlibrarymongodb.repository;

import com.example.springlibrarymongodb.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
}
