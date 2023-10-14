package com.Integrador2.bo;

//SUPERCLASE
public class Producto {
	//ATRIBUTOS
	private int codigo;
	private String nombre;
	private String descripcion;
	private Double precio;
	private int stock;
	
	//METODOS
	//CONSTRUCTOR CON Y SIN SOBRECARGA
	public Producto(){}
	public Producto(int codigo, String nombre, String descripcion, Double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	//SETTERS Y GETTERS
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
	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + ", stock=" + stock + "]";
	}
	
	
	
	
	
	
}
