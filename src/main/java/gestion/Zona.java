package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>(1);
	private ArrayList<Animal> animales;

	public Zona() {}
	
	public Zona(String nombre, Zoologico zoo) {
		this.setNombre(nombre);
		this.zoo.add(zoo);
	}
	
	public void agregarAnimales(Animal animales) {
		this.animales.add(animales);
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	public Zoologico getZoo() {
		return this.zoo.get(0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
	}
	
}
