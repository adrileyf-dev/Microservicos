package com.dev.usuario.Resouces;

import com.dev.usuario.Repositories.UserRepositories;
import com.dev.usuario.entities.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserResources {

    public final UserRepositories repositories;

   @GetMapping(value = "/{id}")
   public ResponseEntity<Users> findById(@PathVariable Long id) {
      Users obj = repositories.findById(id).orElse(null);
      return ResponseEntity.ok(obj);
   }
   @GetMapping(value = "/search")
   public ResponseEntity<Users> findByEmail(@RequestParam String email) {
      Users obj = repositories.findByEmail(email);

      return ResponseEntity.ok(obj);
   }
}