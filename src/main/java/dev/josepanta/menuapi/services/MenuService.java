package dev.josepanta.menuapi.services;

import java.util.List;

import dev.josepanta.menuapi.entities.Menu;

public interface MenuService {

	public List<Menu> findAll();
	
	public Menu findById(Integer id);

	public void save(Menu menu);

	public void deleteById(Integer id);
	
}
