package org.example;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Partido> partido = new ArrayList<Partido>();
	private ArrayList<Deportista> deportistasDelEquipo = new ArrayList<Deportista>();
	private ArrayList<Entrenador> entrenadoresDelEquipo = new ArrayList<Entrenador>();
	private Deporte deporte;
	private Deportista deportista;
	private Entrenador entrenador;

	public String getNombre() {
		return this.nombre;
	}

	public boolean agregarDeportista (Deportista deportista) {
		for (Deportista deportistaAgregado : deportistasDelEquipo) {
			if (deportistaAgregado.equals(deportista)) {
				return false;
			}
		}
		this.deportistasDelEquipo.add(deportista);
		return true;
	}

	public boolean agregarEntrenador (Entrenador entrenador) {
		for (Entrenador entrenadorAgregado : entrenadoresDelEquipo) {
			if (entrenadorAgregado != null) {
				return false;
			}
		}
		this.entrenadoresDelEquipo.add(entrenador);
		return true;
	}

	public ArrayList<Deportista> obtenerDeportistas () {
		return deportistasDelEquipo;
	}

	public ArrayList<Entrenador> obtenerEntrenadores () {
		return entrenadoresDelEquipo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}