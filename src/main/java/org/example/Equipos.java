import java.util.ArrayList;

public class Equipos {
	private String nombre;
	private ArrayList<Partido> partido = new ArrayList<Partido>();
	private Deporte deporte;
	private Deportista deportista;
	private Entrenador entrenador;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}