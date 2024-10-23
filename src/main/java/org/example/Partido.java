import java.util.ArrayList;

public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoEnemigo;
	private Equipo ganador;
	private Cancha cancha;
	private Date fechaInicio;
	private Date fechaTermino;
	private Deporte deporte;
	private ArrayList<Cancha> canchas = new ArrayList<Cancha>();
	private ArrayList<Equipos> equipos = new ArrayList<Equipos>();

	public Equipo getEquipoLocal() {
		return this.equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoEnemigo() {
		return this.equipoEnemigo;
	}

	public void setEquipoEnemigo(Equipo equipoEnemigo) {
		this.equipoEnemigo = equipoEnemigo;
	}

	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}

	public Equipo getGanador() {
		return this.ganador;
	}

	public Cancha getCancha() {
		return this.cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}
}