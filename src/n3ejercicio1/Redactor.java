package n3ejercicio1;

import java.util.ArrayList;

public class Redactor {
	private String nombre;
	private final String dni;
	private static int sueldo = 1500;
	private  ArrayList <Noticia> noticias;

	public Redactor(String nombre, String dni, ArrayList<Noticia> noticias) {
		this.nombre = nombre;
		this.dni = dni;
		this.noticias = noticias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getSueldo() {
		return sueldo;
	}

	public static void setSueldo(int sueldo) {
		Redactor.sueldo = sueldo;
	}

	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(ArrayList<Noticia> noticias) {
		this.noticias = noticias;
	}

	public String getDni() {
		return dni;
	}
		
	@Override
	public String toString() {
		return "Redactor [nombre=" + nombre + ", dni=" + dni + ", noticias=" + noticias.toString() + "]";
	}

}
