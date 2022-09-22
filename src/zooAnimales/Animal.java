package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;

	public Animal(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona) {
		this.totalAnimales = this.totalAnimales + 1;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;	
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo () {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"
				+"Aves: "+Ave.cantidadAves()+"\n"
				+"Reptiles: "+Reptil.cantidadReptiles()+"\n"
				+"Peces: "+Pez.cantidadPeces()+"\n"
				+"Anfibios: "+Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		if (this.zona.size() == 0) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat
					+" y mi genero es "+this.genero+".";
		} else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat
					+" y mi genero es "+this.genero+". la zona en la que me ubico es "+this.zona.get(0)
					+", en el "+this.zona.get(0).getZoo();
		}
	}
}
