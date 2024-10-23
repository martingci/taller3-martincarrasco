package org.example;

import java.util.ArrayList;

public class Deporte {
	private String nombre;
	private Club club;
	private ArrayList<Partido> partidos = new ArrayList<Partido>();
	private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
	private ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	public boolean agregarDeportista(Deportista deportista) {
		for (Deportista deportistaAgregado : deportistas) {
			if (deportistaAgregado.equals(deportista)) {
				return false;
			}
		}
		this.deportistas.add(deportista);
		return true;
	}

	public boolean agregarEntrenador(Entrenador entrenador) {
		for (Entrenador entrenadorAgregado : entrenadores) {
			if (entrenadorAgregado.equals(entrenador)) {
				return false;
			}
		}
		this.entrenadores.add(entrenador);
		return true;
	}

	public boolean agregarEquipo(Equipo equipo) {
		for (Equipo equipoAgregado : equipos) {
			if (equipoAgregado.equals(equipo)) {
				return false;
			}
		}
		this.equipos.add(equipo);
		return true;
	}

	public boolean agregarDeportistaAEquipo(Deportista deportista, Equipo equipo) {
		for (Equipo equipoAgregado : equipos) {
			for (Deportista deportistaAgregado : equipoAgregado.obtenerDeportistas()) {
				if (deportistaAgregado.equals(deportista)) {
					return false;
				}
			}
		}
		for (Equipo equipoAgregado : equipos) {
			if (equipoAgregado.equals(equipo)) {
				equipoAgregado.agregarDeportista(deportista);
				return true;
			}
		}
		return false;
	}

	public boolean agregarEntrenadorAEquipo(Entrenador entrenador, Equipo equipo) {
		for (Equipo equipoAgregado : equipos) {
			for (Entrenador entrenadorAgregado : equipoAgregado.obtenerEntrenadores()) {
				if (entrenadorAgregado.equals(entrenador)) {
					return false;
				}
			}
		}
		for (Equipo equipoAgregado : equipos) {
			if (equipoAgregado.equals(equipo)) {
				equipoAgregado.agregarEntrenador(entrenador);
				return true;
			}
		}
		return false;
	}



}