package dev.josepanta.menuapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.josepanta.menuapi.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
