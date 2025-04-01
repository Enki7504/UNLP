package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
	private Double peso;
	private int precioPorKilo;
	private String descripcion;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPrecio() {
		return precioPorKilo;
	}
	
	public void setPrecioPorKilo(int i) {
		this.precioPorKilo = i;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public void setPeso(int i) {
		this.peso = (double) i;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecioPorKilo() {
		// TODO Auto-generated method stub
		return this.precioPorKilo;
	}
	
	
}
