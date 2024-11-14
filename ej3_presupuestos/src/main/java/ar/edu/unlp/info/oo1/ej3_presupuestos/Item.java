package ar.edu.unlp.info.oo1.ej3_presupuestos;

public class Item {
	private String detalle;
	private Integer cantidad;
	private Double costoUnitario;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String detalle, Integer cant, Double costo) {
		this.detalle = detalle;
		this.cantidad = cant;
		this.costoUnitario = costo;
	}
	
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(Double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	public Double costo() {
		return this.costoUnitario*this.cantidad;
	}
	
	
}
