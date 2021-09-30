package dev.josepanta.menuapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import dev.josepanta.menuapi.entities.Seccion;
import dev.josepanta.menuapi.repositories.SeccionRepository;

public class SeccionServiceImpl implements SeccionService{
	@Autowired
	private SeccionRepository seccionRepository;
	
	@Override
	public List<Seccion> findAll() {
		return seccionRepository.findAll();
	}

	@Override
	public Seccion findById(Integer id) {
		return seccionRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}

	@Override
	public void save(Seccion producto) {
		seccionRepository.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		seccionRepository.deleteById(id);
	}
}
