package com.es.eoi.productator.repository;

import java.util.ArrayList;
import java.util.List;

import com.es.eoi.productator.entities.Product;

public class ProductRepositoryImp implements ProductRepository {

	private List<Product> db;

	public ProductRepositoryImp() {
		db = new ArrayList<Product>();
	}

	public boolean crear(Product product) {
		if (product != null) {
			return this.db.add(product);
		}
		return true;
	}

	public Product leer(Product filter) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean actualizar(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean borrar(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Product> leerTodo(Product filter) {
		List<Product> selected = new ArrayList<Product>();

		for (Product p : this.db)
			if (filter.getNombre() != null && p.getNombre().equals(filter.getNombre()))
				selected.add(p);

		return selected;
	}

}
