package com.dev.oauth.feignclients;

import com.dev.oauth.entities.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "Usuario",path = "/users")
public interface UserFeignClient {

    @GetMapping(value = "/search")
      ResponseEntity<Users> findByEmail(@RequestParam String email);
}
