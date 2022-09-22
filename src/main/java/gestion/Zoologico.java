package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
		this.zonas = zonas;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for (Zona zona: this.zonas) {
			cantidad = zona.cantidadAnimales() + cantidad;
		}
		return cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
