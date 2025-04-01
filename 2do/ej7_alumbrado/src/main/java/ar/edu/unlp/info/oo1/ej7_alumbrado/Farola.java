package ar.edu.unlp.info.oo1.ej7_alumbrado;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	private Boolean estado;
	private List<Farola> vecinos;
	
	public Farola() {
		// TODO Auto-generated constructor stub
		estado = false;
		vecinos = new LinkedList<Farola>();
		
	}
	
	public void pairWithNeighbor (Farola otraFarola) {
		if (!vecinos.contains(otraFarola)) {
			vecinos.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public void turnOn() {
		if (!estado) {
			estado = true;
			vecinos.stream().forEach(Farola::turnOn);
		}
	}
	
	public void turnOff() {
		if (estado) {
			estado = false;
			vecinos.stream().forEach(Farola::turnOff);
		}
	}
	
	public List<Farola> getNeighbors(){
		return new LinkedList<Farola>(vecinos);
	}
	
	public Boolean isOn() {
		return estado;
	}
	
	public Boolean isOff() {
		return !estado;
	}
	
}