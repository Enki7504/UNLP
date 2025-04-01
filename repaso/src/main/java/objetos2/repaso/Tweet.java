package objetos2.repaso;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Tweet implements Posteo {

	private String descripcion;
	private List<Retweet> retweets;

	public Tweet(String descripcion) {
		if (descripcion.length() > 280 && descripcion.length() < 1) {
			throw new RuntimeException("El tweet debe tener un texto de 1 carácter como mínimo y 280 caracteres como máximo");
		}
		this.descripcion = descripcion;
		retweets = new ArrayList<Retweet>();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void addRetweet(Retweet retweet) {
		retweets.add(retweet);
	}

	public void deleteRetweets() {
		retweets.clear();
	}
}
