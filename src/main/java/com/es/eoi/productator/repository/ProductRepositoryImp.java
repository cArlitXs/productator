package com.es.eoi.productator.repository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.es.eoi.productator.entities.Product;
import com.google.gson.Gson;

public class ProductRepositoryImp implements ProductRepository {

	private List<Product> db;
	private String path = "db.json";

	public ProductRepositoryImp() {
		db = new ArrayList<Product>();
	}

	public boolean crear(Product product) throws IOException {
		if (product != null) {
			boolean response = this.db.add(product);

			Gson gson = new Gson();
			String json = gson.toJson(db);

			FileWriter fw = new FileWriter(path, false);
			fw.write(json);
			fw.close();

			return response;
		}
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
		if (product != null) {
			this.db.set(product.getCodigo(), product);
			return true;
		}
		return false;
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

//		List<Product> selected = new ArrayList<Product>();
//		Gson gson = new Gson();
//		BufferedReader br = null;
//		
//		br = new BufferedReader(new FileReader(path));
//		ProductRepositoryImp result = gson.fromJson(br, ProductRepositoryImp.class);
//
//		if (result != null) {
//			for (Product p : result.read()) {
//				selected.add(p);
//			}
//		}
//		
//		return selected;
	}

	public List<Product> leerTodoFilter(Product filter) {
		List<Product> selected = new ArrayList<Product>();

		for (Product p : this.db)
			if (filter.getNombre() != null && p.getNombre().equals(filter.getNombre()))
				selected.add(p);

		return selected;
	}

//	private List<Product> read() {
//		return db;
//	}

}
