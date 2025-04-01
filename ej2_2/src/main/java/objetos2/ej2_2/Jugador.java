package objetos2.ej2_2;

public class Jugador {
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String apellido;
	private int puntuacion;
	
	public Jugador(String nombre,String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntuacion = 0;
	}
	
	public void incrementar() {
        this.puntuacion = this.puntuacion + 100;
    }
    public void decrementar() {
    	this.puntuacion = this.puntuacion - 50;
    }

}
