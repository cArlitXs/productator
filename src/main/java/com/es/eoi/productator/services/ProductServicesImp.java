package com.es.eoi.productator.services;

import java.util.List;

import com.es.eoi.productator.entities.Product;
import com.es.eoi.productator.repository.ProductRepository;

public class ProductServicesImp implements ProductServices {
	
	private ProductRepository myRepository;
	
	public ProductServicesImp() {
		this.myRepository = new ProductServicesImp();
	}

	public boolean crear(Product product) {
		return this.crear(product);
	}

	public Product leer(Product filter) {
		return this.leer(filter);
	}

	public boolean actualizar(Product product) {
		return this.actualizar(product);
	}

	public boolean borrar(Product product) {
		return this.borrar(product);
	}

	public List<Product> leerTodo(Product filter) {
		return this.myRepository.leerTodo(filter);
	}

}
