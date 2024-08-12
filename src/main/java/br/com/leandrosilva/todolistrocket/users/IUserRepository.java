package br.com.leandrosilva.todolistrocket.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository <br.com.leandrosilva.todolistrocket.users.UserModel, UUID>{
    UserModel findByUsername(String username);
}
