package dev.josepanta.menuapi.services;

import java.util.List;

import dev.josepanta.menuapi.entities.Rol;

public interface RolService {

	public List<Rol> findAll();
	
	public Rol findById(Integer id);

	public void save(Rol rol);

	public void deleteById(Integer id);
}
