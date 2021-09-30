package dev.josepanta.menuapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.josepanta.menuapi.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
