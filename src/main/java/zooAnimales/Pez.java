package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez() {
		Pez.listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		Pez.listado.add(this);
	}
	
	public static int cantidadPeces() {
		return Pez.listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad, String genero) {
		Pez.listado.add(new Pez(nombre, edad, "oceano", genero, "rojo", 6));
		++Pez.salmones;	
	}
	
	public void crearBacalao(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Pez.listado.add(new Pez(nombre, edad, "oceano", genero, "gris", 6));
		++Pez.bacalaos;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

}
