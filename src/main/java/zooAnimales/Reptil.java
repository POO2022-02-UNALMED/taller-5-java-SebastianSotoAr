package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		Reptil.listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return Reptil.listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Reptil.listado.add(new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3));
		++Reptil.iguanas;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero, ArrayList<Zona> zona) {
		Reptil.listado.add(new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1));
		++Reptil.serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
