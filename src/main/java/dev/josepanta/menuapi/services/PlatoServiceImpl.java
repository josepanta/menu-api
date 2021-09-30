package dev.josepanta.menuapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import dev.josepanta.menuapi.entities.Plato;
import dev.josepanta.menuapi.repositories.PlatoRepository;

public class PlatoServiceImpl implements PlatoService {

	@Autowired
	private PlatoRepository platoRepository;
	
	@Override
	public List<Plato> findAll() {
		return platoRepository.findAll();
	}

	@Override
	public Plato findById(Integer id) {
		return platoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}

	@Override
	public void save(Plato producto) {
		platoRepository.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		platoRepository.deleteById(id);
	}
}
