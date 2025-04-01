package ar.edu.unlp.info.oo1.ej6_genealogia;

import java.util.Date;

public class Mamifero extends Object {
	private String nombre;
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre=null;
	private Mamifero madre=null;
	
	public Mamifero() {
		// TODO Auto-generated constructor stub
	}
	
	public Mamifero (String nombre) {
		this.setNombre(nombre);
	}
	
	public Mamifero (String id,String especie,Date fecha) {
		// TODO Auto-generated constructor stub
		this.identificador = id;
		this.especie = especie;
		this.fechaNacimiento = fecha;
	}
	
	public Mamifero (String id,String especie,Date fecha,Mamifero padre,Mamifero madre) {
		// TODO Auto-generated constructor stub
		this.identificador = id;
		this.especie = especie;
		this.fechaNacimiento = fecha;
		this.padre = padre;
		this.madre = madre;
	}
	
	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (madre != null) {
			if (padre.getPadre() != null) {
				return padre.getPadre();
			}
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (madre != null) {
			if (madre.getMadre() != null) {
				return madre.getPadre();
			}
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (padre != null) {
			if (padre.getPadre() != null) {
				return padre.getPadre();
			}
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (padre != null) {
			if (madre.getMadre() != null) {
				return madre.getPadre();
			}
		}
		return null;
	}
	
	public Boolean tieneComoAncestroA (Mamifero unMamifero) {
		//Boolean resultado = false;
		if (padre != null && padre != unMamifero) {
			padre.tieneComoAncestroA(unMamifero);
		} else {
			if (padre == unMamifero) {
				return true;
			}
		}
		if (madre != null && madre != unMamifero) {
			madre.tieneComoAncestroA(unMamifero);
		} else {
			if (madre == unMamifero) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
