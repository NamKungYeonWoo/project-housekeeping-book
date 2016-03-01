package com.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
public class GenPassword {
    public static void main(String[] args) {
        System.out.println(
                new BCryptPasswordEncoder().encode("2513")
        );
    }
}
