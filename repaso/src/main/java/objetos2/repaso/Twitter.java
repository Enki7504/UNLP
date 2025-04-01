package objetos2.repaso;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Twitter {

	private List<Usuario> usuarios;

	public Twitter() {
		usuarios = new ArrayList<Usuario>();
	}

	public void addUsuario(Usuario usuario) {
		usuario.stream.filter(u -> u.getName().equals(usuario.getName())).forEach(u -> {
			throw new RuntimeException("Ya existe un usuario con ese nombre");
		});
		usuarios.add(usuario);
	}

	public void deleteUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}
	/**
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Retorna el nombre completo de la persona de la forma apellido, nombre
	 * @return
	 *
	public String getNombreCompleto() {
		return this.getApellido() + ", " + this.getNombre();
	}
	**/
}
