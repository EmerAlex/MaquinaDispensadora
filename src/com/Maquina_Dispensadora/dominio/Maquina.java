package com.Maquina_Dispensadora.dominio;

import java.util.ArrayList;

public class Maquina {

	private String nombre;
	private double cambio;
	private ArrayList<Producto> productos;
	private double dineroIngresado;
	private int posicionProducto;
	private String codigo;

	public Maquina() {
		
	}
	

	public void IngresarCodigoNombreProductoHasacar(String nombre, String codigo) {
		this.nombre=nombre;
		this.codigo=codigo;
	}
	
	private void obtenerPosiciónProductoNombre(String nombre) {

		for (int i = 0; i < productos.size(); i++) {
			if (this.nombre.equals(productos.get(i).getNombre())) {
				this.posicionProducto = i;
			}
		}
	}

	private void obtenerPosiciónProductoCodigo(String codigo) {

		for (int i = 0; i < productos.size(); i++) {
			if (this.codigo.equals(productos.get(i).getCodigo())) {
				this.posicionProducto = i;
			}
		}
	}

	public void agregarUnidadesProducto(String nombre, int unidades) {
		obtenerPosiciónProductoNombre(nombre);

		if (this.productos.get(posicionProducto).getCantidad() + unidades > 0
				&& this.productos.get(posicionProducto).getCantidad() + unidades <= 12) {
			this.productos.get(posicionProducto)
					.setCantidad(this.productos.get(posicionProducto).getCantidad() + unidades);

		} else {
			this.productos.get(posicionProducto).setCantidad(12);

		}
	}

	public boolean sacarProductosNombre() {

		obtenerPosiciónProductoNombre(this.nombre);

		if (this.productos.get(posicionProducto).getPrecio() <= this.dineroIngresado) {

			if (this.productos.get(posicionProducto).getCantidad() > 0) {

				this.productos.get(posicionProducto)
						.setCantidad(this.productos.get(posicionProducto).getCantidad() - 1);
			}
			return true;
		}
		return false;
	}

	public boolean sacarProductosCodigo() {

		obtenerPosiciónProductoCodigo(this.codigo);

		if (this.productos.get(posicionProducto).getPrecio() <= this.dineroIngresado) {

			if (this.productos.get(posicionProducto).getCantidad() > 0) {

				this.productos.get(posicionProducto)
						.setCantidad(this.productos.get(posicionProducto).getCantidad() - 1);
			}
			return true;

		}
		return false;
	}

	public void obtenerCambioNombre() {

		obtenerPosiciónProductoNombre(this.nombre);

		if (sacarProductosNombre() == true &&this.productos.get(posicionProducto).getPrecio() <= this.dineroIngresado) {

			this.cambio = this.dineroIngresado - this.productos.get(posicionProducto).getPrecio();

			System.out.println("Tu cambio es: "+this.cambio);
		}else {
		System.out.println("No tines saldo suficiente para tu compra");
		}
	}

	public void obtenerCambioCodigo() {

		obtenerPosiciónProductoCodigo(this.codigo);

		if (sacarProductosCodigo()==true&&this.productos.get(posicionProducto).getPrecio() <= this.dineroIngresado) {

			this.cambio = this.dineroIngresado - this.productos.get(posicionProducto).getPrecio();

			System.out.println("Tu cambio es: "+this.cambio);
		}else {
		System.out.println("No tines saldo suficiente para tu compra");
		}
	}

	public String productosAgotados() {

		String productoAgotado = "Productos Agotados\n";
		for (Producto productoA : productos) {
			if (productoA.getCantidad() == 0) {
				productoAgotado += productoA.getNombre() + "\n";
			}

		}
		return productoAgotado;

	}

	public void verProductos() {
		for (int i = 0; i < this.productos.size(); i++) {

			if (this.productos.get(i).getCantidad() > 0) {
				System.out.println(this.productos.get(i).getCodigo() + "(" + this.productos.get(i).getNombre()
						+ ")------------($ " + this.productos.get(i).getPrecio() + ")");

			}

		}
	}

	public void verCantidadProductos() {

		for (int i = 0; i < this.productos.size(); i++) {

			System.out.println(
					this.productos.get(i).getNombre() + "--------" + this.productos.get(i).getCantidad() + " unidades");
		}

	}

	public void verCantidadProductoEspecifico() {

		obtenerPosiciónProductoNombre(this.nombre);

		System.out.println(this.productos.get(posicionProducto).getNombre() + "-------"
				+ this.productos.get(posicionProducto).getCantidad()+" unidades");
	}

	public void verProductosAgotados() {

		System.out.println(productosAgotados());

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public double getDineroIngresado() {
		return dineroIngresado;
	}

	public void setDineroIngresado(double dineroIngresado) {
		this.dineroIngresado = dineroIngresado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCambio() {
		return cambio;
	}

}

	