package com.es.eoi.productator.services;

import java.util.List;

import com.es.eoi.productator.entities.Product;
import com.es.eoi.productator.repository.ProductRepository;
import com.es.eoi.productator.repository.ProductRepositoryImp;

public class ProductServicesImp implements ProductServices {
	
	private ProductRepository myRepository;
	
	public ProductServicesImp() {
		this.myRepository = new ProductRepositoryImp();
	}

	public boolean crear(Product product) {
		return this.myRepository.crear(product);
	}

	public Product leer(Product filter) {
		return this.myRepository.leer(filter);
	}

	public boolean actualizar(Product product) {
		return this.myRepository.actualizar(product);
	}

	public boolean borrar(Product product) {
		return this.myRepository.borrar(product);
	}
	
	public List<Product> leerTodo() {
		return this.myRepository.leerTodo();
	}

	public List<Product> leerTodoFilter(Product filter) {
		return this.myRepository.leerTodoFilter(filter);
	}

}
