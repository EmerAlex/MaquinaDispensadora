package com.Maquina_Dispensadora.app;
import java.util.ArrayList;
import java.util.Arrays;

import com.Maquina_Dispensadora.dominio.Maquina;
import com.Maquina_Dispensadora.dominio.Producto;

public class Main {

	public static void main(String[] args) {
		
		Maquina maquina = new Maquina();
		
		//creacion de productos
		Producto chocorramo = new Producto("chocorramo", "A-1", 900d, 11);
		Producto margarita = new Producto("margatita", "A-2", 1200d, 10);
		Producto chocoso = new Producto("chocoso", "B-1", 900d, 12);
		Producto lecherita = new Producto("lecherita", "B-2", 400d, 12);
		Producto mani = new Producto("mani", "C-1", 600d, 12);
		Producto barraSerial = new Producto("barraserial", "C-2", 1500d, 12);
		Producto granola = new Producto("granola", "D-1", 900d, 12);
		Producto galletasSaladas = new Producto("galletassaladas", "D-2", 500d, 12);
		Producto chocolatina = new Producto("chocolatina", "E-1", 600d, 12);
		Producto jugoCaja = new Producto("jugocaja", "E-2", 700d, 12);
		
		//Se manada cada producto a una arraylist
		ArrayList<Producto> productos = new ArrayList<Producto>(Arrays.asList(chocorramo, margarita, chocoso, lecherita,mani, barraSerial, granola, galletasSaladas, chocolatina, jugoCaja));
		
		//Se manda la arraylist creada anteriormente a la arraylist de productos que esta en la clase Maquina
		maquina.setProductos(productos);
		
		//Llamamos al metodo ver productos el cuak mostrara por consola el codigo, nombre y precio de cada uno
		maquina.verProductos();
		
		//Realizamos una compra con el nombre del producto
		maquina.IngresarCodigoNombreProductoHasacar("chocorramo", "A-1");
		maquina.setDineroIngresado(2000);
		System.out.println("\nEl producto que compraste fue: "+maquina.getNombre());
		maquina.sacarProductosNombre();
		maquina.obtenerCambioNombre();
		
		//Realizamos compra con el codigo del producto
		maquina.IngresarCodigoNombreProductoHasacar("lecherita", "B-2");
		maquina.setDineroIngresado(5000);
		System.out.println("\nEl producto que compraste fue: "+maquina.getNombre());
		maquina.sacarProductosCodigo();
		maquina.obtenerCambioCodigo();
		
		//Vemos los productos y las cantidades
		System.out.println("\nLa cantidad por cada producto es");
		maquina.verCantidadProductos();
		
		//Vaciamos un producto
		System.out.println("\n");
		maquina.IngresarCodigoNombreProductoHasacar("jugocaja", "E-2");
		maquina.setDineroIngresado(2200);
		maquina.sacarProductosNombre();maquina.sacarProductosNombre();
		maquina.sacarProductosNombre();maquina.sacarProductosNombre();
		maquina.sacarProductosNombre();maquina.sacarProductosNombre();
		maquina.sacarProductosNombre();maquina.sacarProductosNombre();
		maquina.sacarProductosNombre();maquina.sacarProductosNombre();
		maquina.sacarProductosNombre();
		maquina.sacarProductosNombre();
		maquina.verCantidadProductoEspecifico();
		
		
		//Mostramos los productos agotados
		System.out.println("\n");
		maquina.verProductosAgotados();
		
		//Si se queda un producto con cantidad 0 este automatica sale de las lista de productos y pasa a la lista de productos agotados
		System.out.println("\n");
		maquina.verProductos();
		
		//Vamos a ingresas nuevas cantidades del producto jogocaja
		System.out.println("\n");
		maquina.agregarUnidadesProducto("jugocaja", 5);
		maquina.verCantidadProductoEspecifico();
		
		//Al poner mas cantidad del producto agotado este vuelve y aparece en la lista
		System.out.println("\n");
		maquina.verProductos();
		
		System.out.println("\n");
		maquina.verCantidadProductos();
		
		
	}
	
}

	
	
	
