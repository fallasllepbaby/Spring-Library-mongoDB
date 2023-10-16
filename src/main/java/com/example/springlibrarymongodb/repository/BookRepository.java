package com.example.springlibrarymongodb.repository;

import com.example.springlibrarymongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
