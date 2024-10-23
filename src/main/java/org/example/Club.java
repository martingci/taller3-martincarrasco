package org.example;

import java.util.ArrayList;
import java.util.Date;

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
		return this.canchas;
	}

	public boolean agregarDeporte (Deporte deporteAAgregar)  {
		for (Deporte deporte : deportes) {
			if (deporte.equals(deporteAAgregar)) {
				return false;
			}
		}
		this.deportes.add(deporteAAgregar);
		return true;
	}

	public boolean crearPartido (Equipo equipo1, Equipo equipo2, Cancha cancha, Date inicio, Date termino) {
		for (Deporte deporte : deportes) {
			for (Equipo equipo : deporte.obtenerEquipos()) {
				if (equipo.equals(equipo1) || equipo.equals(equipo2)) {
					Partido partido = new Partido();
					partido.setEquipoLocal(equipo1);
					partido.setEquipoEnemigo(equipo2);
					partido.setCancha(cancha);
					partido.setfechaInicio(inicio);
					partido.setfechaTermino(termino);
					deporte.AgregarPartido(partido);
					return true;
				}
			}
		}
		return false;
	}

	Club (String nombre) {
		this.nombre = nombre;
	}

}