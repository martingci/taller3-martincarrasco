package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoEnemigo;
	private Equipo ganador;
	private Cancha cancha;
	private Date fechaInicio;
	private Date fechaTermino;
	private Deporte deporte;
	private ArrayList<Cancha> canchas = new ArrayList<Cancha>();
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

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

	public void setfechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setfechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

}