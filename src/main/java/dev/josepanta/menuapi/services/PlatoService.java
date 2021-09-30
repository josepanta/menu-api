package dev.josepanta.menuapi.services;

import java.util.List;

import dev.josepanta.menuapi.entities.Plato;

public interface PlatoService {

	public List<Plato> findAll();
	
	public Plato findById(Integer id);

	public void save(Plato plato);

	public void deleteById(Integer id);
}
