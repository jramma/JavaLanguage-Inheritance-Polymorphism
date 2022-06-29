package n3ejercicio1;

import java.util.Arrays;

public class Redactor {
	private String nombre;
	private final String dni;
	private static int sueldo = 1500;
	private Noticia noticias[];

	public Redactor(String nombre, String dni, Noticia[] noticias) {
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

	public Noticia[] getNoticias() {
		return noticias;
	}

	public void setNoticias(Noticia[] noticias) {
		this.noticias = noticias;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Redactor [nombre=" + nombre + ", dni=" + dni + ", noticias=" + Arrays.toString(noticias) + "]";
	}

}
