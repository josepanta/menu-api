package dev.josepanta.menuapi.services;

import java.util.List;

import dev.josepanta.menuapi.entities.Permiso;

public interface PermisoService {

	public List<Permiso> findAll();
	
	public Permiso findById(Integer id);

	public void save(Permiso permiso);

	public void deleteById(Integer id);
}
