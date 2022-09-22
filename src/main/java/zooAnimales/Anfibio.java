package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		Anfibio.listado.add(this);
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
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
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.listado.add(rana);
		++Anfibio.ranas;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.listado.add(salamandra);
		++Anfibio.salamandras;
		return salamandra;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}
	
}
