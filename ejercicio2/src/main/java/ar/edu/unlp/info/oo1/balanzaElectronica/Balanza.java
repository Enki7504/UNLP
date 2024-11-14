package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.util.Date;

public class Balanza {
	private Integer cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;
	
	public Balanza() {
		// TODO Auto-generated constructor stub
	}
	
	public void ponerEnCero() {
		pesoTotal = 0.0;
		precioTotal = 0.0;
		cantidadDeProductos = 0;
	}
	
	public void agregarProducto (Producto producto) {
		precioTotal += producto.getPrecio()*producto.getPeso();
		pesoTotal += producto.getPeso();
		cantidadDeProductos++;
	}
	
	public Ticket emitirTicket() {
		Date date = new Date();
		Ticket ticket = new Ticket(date,this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
		return ticket;
		
	}

	public Double getPesoTotal() {
		// TODO Auto-generated method stub
		return this.pesoTotal;
	}

	public Double getPrecioTotal() {
		// TODO Auto-generated method stub
		return this.precioTotal;
	}

	public Integer getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return this.cantidadDeProductos;
	}
	
	
	
}
