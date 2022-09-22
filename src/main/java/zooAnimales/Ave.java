package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.setColorPlumas(colorPlumas);
		Ave.listado.add(this);
	}
	
	public static int cantidadAves() {
		return Ave.listado.size();
	}

	public String movimiento() {
		return "volar";
	}
	
	public static void crearHalcon(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Ave.listado.add(new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso"));
		++Ave.halcones;
	}
	
	public static void crearAguila(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Ave.listado.add(new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo"));
		++Ave.aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}	
}
