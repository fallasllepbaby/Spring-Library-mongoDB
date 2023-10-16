package com.example.springlibrarymongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Loan {
    @Id
    private String id;
    private String userId;
    private String bookId;
    private Date dueDate;

    // Constructors, getters, setters, and other methods

    // Constructors, getters, setters, and other methods


    public Loan() {
    }

    public Loan(String id, String userId, String bookId, Date dueDate) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}