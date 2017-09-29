package com.journal.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

/**
 * Created by User on 27/09/2017.
 */
//@Configuration
//@EnableGlobalAuthentication
public class InMemorySecurityConfiguration {

    //@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
            auth.inMemoryAuthentication()
                    .withUser("user")
                    .password("1van")
                    .roles("USER")
                    .and()
                    .withUser("admin")
                    .password("1van")
                    .roles("USER","ADMIN");
    }
}
