package com.dev.oauth.resources;

import com.dev.oauth.entities.Users;
import com.dev.oauth.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserResource {
    private  final UserServices services;
    @GetMapping(value = "/search")

   public ResponseEntity<Users> findByEmail(@RequestParam String email){
      try {
          Users users = services.findByEmail(email);
          return  ResponseEntity.ok(users);
      }catch (IllegalArgumentException e ){
          return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      }
    }
}
