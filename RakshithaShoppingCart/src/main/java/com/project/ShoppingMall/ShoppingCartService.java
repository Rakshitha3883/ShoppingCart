package com.project.ShoppingMall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class ShoppingCartService {
	@Autowired
	
	private ShoppingcartRepository repository;
	
	public List<ShoppingCart>listAll(){
		return repository.findAll();
	}

	public ShoppingCart get(Integer id) {
		return repository.findById(id).get();
	}
	public ShoppingCart save(ShoppingCart shoppingcart) {
		return repository.save(shoppingcart);
		
		
	}
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}
}
