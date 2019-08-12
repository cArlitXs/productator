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
		if (product != null)
			return this.db.add(product);
		return true;
	}

	public Product leer(Product filter) {
		if (filter != null)
			return filter;
		else
			return null;
	}

	@SuppressWarnings("unlikely-arg-type")
	public boolean actualizar(Product product) {
		if (product != null)
			if (this.db.set(this.db.indexOf(product.getCodigo()), product) != null)
				return true;
		return true;
	}

	public boolean borrar(Product product) {
		if (product != null)
			return this.db.remove(product);
		return true;
	}

	public List<Product> leerTodo() {
		List<Product> selected = new ArrayList<Product>();

		for (Product p : this.db)
				selected.add(p);

		return selected;
	}
	
	public List<Product> leerTodoFilter(Product filter) {
		List<Product> selected = new ArrayList<Product>();

		for (Product p : this.db)
			if (filter.getNombre() != null && p.getNombre().equals(filter.getNombre()))
				selected.add(p);

		return selected;
	}

}
