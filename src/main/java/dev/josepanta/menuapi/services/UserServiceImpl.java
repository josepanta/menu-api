package dev.josepanta.menuapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import dev.josepanta.menuapi.entities.User;
import dev.josepanta.menuapi.repositories.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(String id) {
		return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}

	@Override
	public void save(User producto) {
		userRepository.save(producto);
	}

	@Override
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}
}
