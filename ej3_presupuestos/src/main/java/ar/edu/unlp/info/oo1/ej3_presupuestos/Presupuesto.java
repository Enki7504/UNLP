package ar.edu.unlp.info.oo1.ej3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		// TODO Auto-generated constructor stub
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	public Presupuesto(String nombre) {
		// TODO Auto-generated constructor stub
		this.cliente = nombre;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public Double calcularTotal() {
		Double total = 0.0;
		for (Item item : items) {
			total += item.costo();
		}
		return total;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	
	
}
