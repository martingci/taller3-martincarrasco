import java.util.ArrayList;

public class Club {
	private String nombre;
	private ArrayList<Deporte> deportes = new ArrayList<Deporte>();
	private ArrayList<Cancha> canchas = new ArrayList<Cancha>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cancha> verCanchas() {
		throw new UnsupportedOperationException();
	}
}