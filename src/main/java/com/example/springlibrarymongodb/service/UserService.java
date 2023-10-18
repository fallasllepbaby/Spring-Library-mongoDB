package com.example.springlibrarymongodb.service;

import com.example.springlibrarymongodb.model.Role;
import com.example.springlibrarymongodb.model.User;
import com.example.springlibrarymongodb.repository.RoleRepository;
import com.example.springlibrarymongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

}
