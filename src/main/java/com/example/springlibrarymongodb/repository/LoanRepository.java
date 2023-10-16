package com.example.springlibrarymongodb.repository;

import com.example.springlibrarymongodb.model.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends MongoRepository<Loan, String> {
}
