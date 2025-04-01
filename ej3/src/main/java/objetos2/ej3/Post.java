package objetos2.ej3;

import java.time.LocalDateTime;

public class Post {

	private Usuario user;
	private LocalDateTime fecha;
	
	public Post(Usuario user,LocalDateTime fecha) {
		this.user = user;
		this.fecha = fecha;
	}
	
	public boolean loPublico(Usuario user) {
		return this.user.equals(user);
	}
	
	public boolean sosMasNuevo(Post p1) {
		return this.fecha.isAfter(p1.getFecha());
	}

	protected LocalDateTime getFecha() {
		// TODO Auto-generated method stub
		return this.fecha;
	}

}
