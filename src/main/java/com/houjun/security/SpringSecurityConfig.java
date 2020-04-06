package com.houjun.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
/*
 * Configuration表明这个类是spring的配置类
 * EnableWebSecurity：启用Security Web
 * */

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 代替security配置文件中，  验证管理器部分
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication().authoritiesByUsernameQuery().usersByUsernameQuery().passwordEncoder(new NoOpPasswordEncoder())
//        auth.inMemoryAuthentication().withUser("zhangsan").password("123456").authorities("ROLE_Admin").roles();
    }

    /**
     * 代替我们security配置文件中 拦截器部分
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests()
//                .antMatchers("/**").hasRole().and().requiresChannel().re
//                .fullyAuthenticated().and().formLogin()
//                .and().logout().permitAll();
    }

}
