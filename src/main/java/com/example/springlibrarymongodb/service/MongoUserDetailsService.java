package com.example.springlibrarymongodb.service;

import com.example.springlibrarymongodb.repository.UserRepository;
import com.example.springlibrarymongodb.security.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MongoUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public MongoUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var u = userRepository.findByUsername(username);
        return u.map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found " + username));
    }
}
