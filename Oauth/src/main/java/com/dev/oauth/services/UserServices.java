package com.dev.oauth.services;

import com.dev.oauth.entities.Users;
import com.dev.oauth.feignclients.UserFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServices implements UserDetailsService {
    private final UserFeignClient userFeignClient;
    public Users findByEmail(String email){
        Users users = userFeignClient.findByEmail(email).getBody();
        if(users == null){
            log.info( "Sem email " + email);
            throw  new IllegalArgumentException("Email not found");
        }
        log.info("Achou o Email " + email);
        return  users;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users users = userFeignClient.findByEmail(s).getBody();
        if(users == null){
            log.info( "Sem email " + s);
            throw  new UsernameNotFoundException("Email not found");
        }
        log.info("Achou o Email " + s);
        return  users;
    }
}
