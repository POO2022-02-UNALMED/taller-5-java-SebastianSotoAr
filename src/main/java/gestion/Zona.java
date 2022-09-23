package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoologico;
	private ArrayList<Animal> animales = new ArrayList<Animal>(1);

	public Zona() {}
	
	public Zona(String nombre, Zoologico zoologico) {
		this.nombre = nombre;
		this.zoologico = zoologico;
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
		animal.setZona(this);
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	public Zoologico getZoo() {
		return this.zoologico;
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

	public void setZoo(Zoologico zoologico) {
		this.zoologico = zoologico;
	}
	
}
