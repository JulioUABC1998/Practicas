package Ecosistema.entity;

import java.io.Serializable;

import Ecosistema.boundary.SistemaBiologico;

public class Biocenosis implements Serializable {
	private String nombre;
	public SistemaBiologico elSistemaBiologico;
	
	public Biocenosis(String nombre, SistemaBiologico elSistemaBiologico) {
		super();
		this.nombre = nombre;
		this.elSistemaBiologico = elSistemaBiologico;
	}

	public String getNombre() {
		return nombre;
	}

	public SistemaBiologico getElSistemaBiologico() {
		return elSistemaBiologico;
	}

	@Override
	public String toString() {
		return "Biocenosis [nombre=" + nombre + "]";
	}
	
}