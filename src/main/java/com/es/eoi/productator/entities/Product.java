package com.es.eoi.productator.entities;

import com.es.eoi.productator.enums.Category;
import com.es.eoi.productator.enums.IVA;

public class Product {

	private int codigo;
	private String nombre;
	private String descripcion;
	private IVA iva;
	private Double precio;
	private Integer stock;
	private Integer vendido;
	private Category categoria;

	public static int id = 1;

//	CONSTRUCTOR
	public Product(String nombre, String descripcion, IVA iva, Double precio, int stock, Category categoria) {
		super();
		this.codigo = Product.id++;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.iva = iva;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}

//	GETTERS AND SETTERS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public IVA getIva() {
		return iva;
	}

	public void setIva(IVA iva) {
		this.iva = iva;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Integer getVendido() {
		return vendido;
	}

	public void setVendido(int vendido) {
		this.vendido = vendido;
	}

	public Category getCategoria() {
		return categoria;
	}

	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}

//	TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [codigo=");
		builder.append(codigoRelleno(codigo));
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", iva=");
		builder.append(iva);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", stock=");
		builder.append(stock);
		builder.append(", vendido=");
		builder.append(vendido);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append("]");
		return builder.toString();
	}

	private String codigoRelleno(int codigo) {
		String cadena = codigo + "";

		while(cadena.length() < 4) {
			cadena = "0" + cadena;
		}
		return cadena;
	}
}
