package com.Maquina_Dispensadora.dominio;

public class Producto {
	
	private String nombre;
	private String codigo;
	private double precio;
	private int cantidad;
	private int contador;
	
	public Producto(String nombre, String codigo, double precio, int cantidad) {
		
		this.nombre=nombre;
		this.codigo=codigo;
		this.cantidad=cantidad;
		this.precio=precio;
		this.contador*=1;
	}
	
	
	

	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}






	public int getContador() {
		return contador;
	}
	
	
	

}
