package com.example.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-19
 */

@Entity
@Data
@Table(name = "users")
public class User
{
    @Id
    private String userName;

    @JsonIgnore
    private String encodedPassword;
}
