package dev.josepanta.menuapi.services;

import java.util.List;

import dev.josepanta.menuapi.entities.Seccion;

public interface SeccionService {
	
	public List<Seccion> findAll();
	
	public Seccion findById(Integer id);

	public void save(Seccion seccion);

	public void deleteById(Integer id);
}
