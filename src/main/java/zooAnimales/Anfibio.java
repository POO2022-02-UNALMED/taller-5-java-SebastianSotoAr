package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		Anfibio.listado.add(this);
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		Anfibio.listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Anfibio.listado.add(new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true));
		++Anfibio.ranas;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Anfibio.listado.add(new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true));
		++Anfibio.salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
}
