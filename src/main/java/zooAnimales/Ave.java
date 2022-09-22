package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave() {
		Ave.listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.setColorPlumas(colorPlumas);
		Ave.listado.add(this);
	}
	
	public static int cantidadAves() {
		return Ave.listado.size();
	}

	public String movimiento() {
		return "volar";
	}
	
	public static void crearHalcon(String nombre, int edad, String genero) {
		Ave.listado.add(new Ave(nombre, edad, "montanas", genero, "cafe glorioso"));
		++Ave.halcones;
	}
	
	public static void crearAguila(String nombre, int edad, String genero) {
		Ave.listado.add(new Ave(nombre, edad, "montanas", genero, "blanco y amarillo"));
		++Ave.aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}	
}
