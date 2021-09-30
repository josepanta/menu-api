package dev.josepanta.menuapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.josepanta.menuapi.entities.Permiso;
import dev.josepanta.menuapi.repositories.PermisoRepository;

@Service
@Transactional
public class PermisoServiceImpl implements PermisoService{
	
	@Autowired
	private PermisoRepository permisoRepository;
	
	@Override
	public List<Permiso> findAll() {
		return permisoRepository.findAll();
	}

	@Override
	public Permiso findById(Integer id) {
		return permisoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}

	@Override
	public void save(Permiso producto) {
		permisoRepository.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		permisoRepository.deleteById(id);
	}
	
}
