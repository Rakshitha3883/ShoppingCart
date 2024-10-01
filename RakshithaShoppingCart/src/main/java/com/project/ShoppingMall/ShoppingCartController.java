package com.project.ShoppingMall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {
	 @Autowired
	 private ShoppingCartService service;
	 
	 //Retrieval
	 @GetMapping("/shoppingcart")
	 public List<ShoppingCart> list(){
     return service.listAll();
	 }
	 //Retrieve By Id
	 @GetMapping("/shoppingcart/{id}")
	 public ResponseEntity<ShoppingCart> get(@PathVariable Integer id){
		try {
			ShoppingCart shoppingcart=service.get(id);
			return new ResponseEntity<ShoppingCart>(shoppingcart,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<ShoppingCart>(HttpStatus.NOT_FOUND);
		}
	 }
	 //Create
	 @PostMapping("/shoppingcart")
		public void add(@RequestBody ShoppingCart shoppingcart ) {
			service.save(shoppingcart);
		 
	 }
	 //Update
	 @PutMapping("/shoppingcart/{id}")
	 public ResponseEntity<ShoppingCart> update (@RequestBody ShoppingCart shoppingcart,@PathVariable Integer id){
		 try {
			ShoppingCart  existShoppingCart =service.get(id);
			shoppingcart.setId(id);
			 service.save(shoppingcart);
			 return new ResponseEntity<ShoppingCart>(HttpStatus.OK);
		} catch (Exception e ) {
			// TODO Auto-generated catch block
			 return new ResponseEntity<ShoppingCart>(HttpStatus.NOT_FOUND);
			 
			
		}
		 
		 
	 }
	 //Delete
	 @DeleteMapping("/shoppingcart/{id}")
	 public void delete(@PathVariable Integer id){
		 service.delete(id);
	 }
	 
	
	 
}
