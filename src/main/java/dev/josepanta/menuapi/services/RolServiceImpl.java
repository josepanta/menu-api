package dev.josepanta.menuapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import dev.josepanta.menuapi.entities.Rol;
import dev.josepanta.menuapi.repositories.RolRepository;

public class RolServiceImpl implements RolService{
	
	@Autowired
	private RolRepository rolRepository;
	
	@Override
	public List<Rol> findAll() {
		return rolRepository.findAll();
	}

	@Override
	public Rol findById(Integer id) {
		return rolRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}

	@Override
	public void save(Rol producto) {
		rolRepository.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		rolRepository.deleteById(id);
	}
}
