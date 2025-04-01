package objetos2.repaso;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Retweet implements Posteo {

	private Posteo origen;

	public Retweet(Posteo origen){
		this.origen = origen
		origen.addRetweet(this);
	}

	public Tweet getOrigen() {
		return origen;
	}
}
