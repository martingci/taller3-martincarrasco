package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Cancha {
	private String superficie;
	private String ubicacion;
	private int capacidadEspectadores;
	private Club club;
	private Partido partido;

	public String getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public void registrarUso(Object partido) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Partido> verUsos() {
		throw new UnsupportedOperationException();
	}

	public boolean disponible(Date fecha) {
		throw new UnsupportedOperationException();
	}
}