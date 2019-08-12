package com.es.eoi.productator.repository;

import java.util.List;

import com.es.eoi.productator.entities.Product;

public interface ProductRepository {

	public boolean crear(Product product);
	public Product leer(Product filter);
	public boolean actualizar(Product product);
	public boolean borrar(Product product);

	public List<Product> leerTodo();
	public List<Product> leerTodoFilter(Product filter);

}
