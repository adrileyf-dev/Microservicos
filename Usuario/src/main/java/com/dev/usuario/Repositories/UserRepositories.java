package com.dev.usuario.Repositories;

import com.dev.usuario.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<Users,Long> {
    Users findByEmail(String email);


}
