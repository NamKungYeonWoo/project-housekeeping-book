package com.example.login;

import com.example.user.dto.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
    private final User user;

    public LoginUserDetails(User user)
    {
        super(user.getUserName(), user.getEncodedPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));

        this.user = user;
    }
}
