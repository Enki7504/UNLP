package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.util.Date;

public class Ticket {
	private Date fecha;
	private Integer cantidadDeProductos;
	private Double pesoTotal;
	private Double precioTotal;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	
	public Ticket(Date fecha, Integer cantidadDeProductos, Double pesoTotal, Double precioTotal) {
		// TODO Auto-generated constructor stub
		this.fecha = fecha;
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal+this.impuesto();
	}
	
	public Double impuesto() {
		return this.getPrecioTotal()*0.21;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
}
