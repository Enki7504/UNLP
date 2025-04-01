package objetos2.ej4;

import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Carrito {
	
	private List<ItemCarrito> items;
	    
	public double total() {
		return this.items.stream().mapToDouble(item -> item.getTotal()).sum();
		/*
		return this.items.stream()
		.mapToDouble(item -> 
		item.getProducto().getPrecio() * item.getCantidad())
		.sum();
		*/
    }
}

