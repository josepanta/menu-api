package dev.josepanta.menuapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.josepanta.menuapi.entities.Menu;
import dev.josepanta.menuapi.repositories.MenuRepository;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Override
	public List<Menu> findAll() {
		return menuRepository.findAll();
	}

	@Override
	public Menu findById(Integer id) {
		return menuRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}

	@Override
	public void save(Menu producto) {
		menuRepository.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		menuRepository.deleteById(id);
	}
}
