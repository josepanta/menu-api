package dev.josepanta.menuapi.services;

import java.util.List;

import dev.josepanta.menuapi.entities.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findById(String id);

	public void save(User user);

	public void deleteById(String id);
}
