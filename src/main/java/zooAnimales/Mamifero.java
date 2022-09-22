package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		Mamifero.listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public static void crearCaballo(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Mamifero.listado.add(new Mamifero(nombre, edad, "pradera", genero, zona, true, 4));
		++Mamifero.caballos;
	}
	
	public static void crearLeon(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Mamifero.listado.add(new Mamifero(nombre, edad, "selva", genero, zona, true, 4));
		++Mamifero.leones;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
}
