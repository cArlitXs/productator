package com.es.eoi.productator.services;

import java.util.List;

import com.es.eoi.productator.entities.Product;
import com.es.eoi.productator.repository.ProductRepository;

public interface ProductServices extends ProductRepository {

	public boolean crear(Product product);
	public Product leer(Product filter);
	public boolean actualizar(Product product);
	public boolean borrar(Product product);
	
	public List<Product> leerTodo(Product filter);
	
}
