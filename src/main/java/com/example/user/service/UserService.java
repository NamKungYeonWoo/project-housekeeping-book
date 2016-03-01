package com.example.user.service;

import com.example.user.dto.User;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-20
 */

@Service
@Transactional
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User save(User user)
    {
        return userRepository.save(user);
    }

    public List<User> findAll()
    {
        return userRepository.findAll();
    }
}
