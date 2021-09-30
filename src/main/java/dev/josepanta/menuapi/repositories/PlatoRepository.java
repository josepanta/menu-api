package dev.josepanta.menuapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.josepanta.menuapi.entities.Plato;

public interface PlatoRepository extends JpaRepository<Plato, Integer> {

}
