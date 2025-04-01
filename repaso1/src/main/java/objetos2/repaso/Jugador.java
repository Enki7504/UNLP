package objetos2.repaso;

include java.util.*;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Usuario {

	private String screenName;
	private List<Posteo> posteos;

	public Usuario(String screenName) {
		this.screenName = screenName;
		posteos = new ArrayList<Posteo>();
	}

	public void addTweet(Tweet posteo) {
		posteos.add(posteo);
	}

	public void addRetweet(Retweet posteo) {
		posteos.add(posteo);
	}

	public String getName(){
		return this.screenName;
	}

	public void deleteTweets(){
		posteos.stream().filter(p -> p instanceof Tweet).forEach(p -> p.deleteRetweets());
		posteos.clear();
	}

}
