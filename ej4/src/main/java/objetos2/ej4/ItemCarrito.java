package objetos2.ej4;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class ItemCarrito {
	private Producto producto;
    private int cantidad;

	public double getTotal() {
		// TODO Auto-generated method stub
		return this.producto.getPrecio()*this.cantidad;
	}

}

