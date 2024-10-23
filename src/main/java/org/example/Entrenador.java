public class Entrenador {
	private String nombre;
	private Deporte deporteE;
	private int aexperiencia;
	private Equipos equipo;
	private Deporte deporte;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public int getAexperiencia() {
		return this.aexperiencia;
	}

	public void setAexperiencia(int aexperiencia) {
		this.aexperiencia = aexperiencia;
	}
}