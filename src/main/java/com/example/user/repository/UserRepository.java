package com.example.user.repository;

import com.example.user.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-19
 */
public interface UserRepository extends JpaRepository<User, String>
{
}
