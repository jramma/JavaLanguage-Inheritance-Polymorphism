package n3ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// este ejercicio aÃºn no estÃ¡ acabado

		ArrayList<Redactor> redactores = new ArrayList<Redactor>();
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		int eleccion = 0;
		do {
			System.out.println("--------------------------------------");
			System.out.println("Esculli una opciï¿½ (1/8):");
			System.out.println("1.- Introduir redactor.");
			System.out.println("2.- Eliminar redactor.");
			System.out.println("3.- Introduir notï¿½cia a un redactor.");
			System.out.println("4.- Eliminar notï¿½cia (ha de demanar redactor i titular de la notï¿½cia).");
			System.out.println("5.- Mostrar totes les notï¿½cies per redactor.");
			System.out.println("6.- Calcular puntuaciï¿½ de la notï¿½cia.");
			System.out.println("7.- Calcular preu-notï¿½cia.");
			System.out.println("8.- Eixir.");
			eleccion = menu(redactores, noticias);
		} while (eleccion != 8);
	}

	private static int menu(ArrayList<Redactor> redactores, ArrayList<Noticia> noticias) {
		int eleccion = 0;
		do {
			if (eleccion > 8 || eleccion < 1) {
				System.out.println("Introduce un valor entre 1 y 8");
			}
			eleccion = sc.nextInt();
		} while (eleccion > 8 || eleccion < 1);
		switch (eleccion) {
		case 1:
			altaRedactor(redactores, noticias);
			break;
		case 2:
			eliminarRedactor(redactores);
			break;
		case 3:
			introducirNoticiaAUnRedactor(redactores, noticias);
			break;
		case 4:
			eliminarNoticia(noticias);
			break;
		case 5:
			mostrarNoticias(noticias);
			break;
		case 6:
			calcularPuntuacionNoticia(noticias);
			break;
		case 7:
			calcularPrecioNoticia(noticias);
			break;
		default:
			System.out.println("Eixint.");
		}
		return eleccion;
	}

	private static void calcularPrecioNoticia(ArrayList<Noticia> noticias) {
		Noticia noticia = buscadorNoticia(noticias);
		if (noticia == null) {
			System.out.println("La noticia no existe");
		} else {
			noticia.calcularNoticia();
		}
	}

	private static void calcularPuntuacionNoticia(ArrayList<Noticia> noticias) {
		Noticia noticia = buscadorNoticia(noticias);
		if (noticia == null) {
			System.out.println("La noticia no existe");
		} else {
			noticia.calcularPuntuacion();
		}
	}

	private static void mostrarNoticias(ArrayList<Noticia> noticias) {
		Noticia noticia = buscadorNoticia(noticias);
		noticia.toString();
	}

	private static void eliminarNoticia(ArrayList<Noticia> noticias) {
		Noticia noticia = buscadorNoticia(noticias);
		if (noticia == null) {
			System.out.println("La noticia no existe");
		} else {
			System.out.println("La noticia siguiente noticia ha sido eliminada: \n" + noticia.toString());
			noticias.remove(noticia);

		}
	}

	private static Noticia buscadorNoticia(ArrayList<Noticia> noticias) {
		System.out.println("Introduce el titular de la noticia");
		String nombre = sc.nextLine();
		int i = 0;
		int limite = noticias.size();
		Noticia noticia = null;
		while (i < limite && noticia == null) {
			if (noticias.get(i).getTitular().equalsIgnoreCase(nombre)) {
				noticia = noticias.get(i);
			}
			i++;
		}

		return noticia;
	}

	private static void introducirNoticiaAUnRedactor(ArrayList<Redactor> redactores, ArrayList<Noticia> noticias) {
		System.out.println("¿Ha qué redactor desea añadir la noticia?");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {
			System.out.println("El redactor no existe");
		} else {

			tipoNoticia(noticias);
			System.out.println("La noticia ha sido añadida. ");
		}
	}

	private static void tipoNoticia(ArrayList<Noticia> noticias) {
		System.out.println("¿cuál es el titular de la noticia?");
		String titular = sc.nextLine();
		System.out.println("Introduzca el texto de la noticia:");
		String text = sc.nextLine();
		int precio = 0;
		int puntuacion = 0;
		int eleccion;
		do {
			System.out.println("Introduce el tipo de noticia (1/6):");
			System.out.println("1. Futbol");
			System.out.println("2. Basket");
			System.out.println("3. Tenis");
			System.out.println("4. F1");
			System.out.println("5. Motociclismo");
			eleccion = sc.nextInt();
			sc.nextLine();
		} while (eleccion > 5 || eleccion < 1);
		String competicion = null, club = null, jugador = null, escuderia = null;

		System.out.println("Nombre de la competicion:");
		competicion = sc.nextLine();

		if (eleccion == 1 || eleccion == 2) {
			System.out.println("Nombre del club: ");
			club = sc.nextLine();
		}
		if (eleccion == 1 || eleccion == 3) {
			System.out.println("Nombre del jugador:");
			jugador = sc.nextLine();

		}
		if (eleccion == 3 || eleccion == 4) {
			System.out.println("Introduce el nombre de la escuderia o equipo:");
			escuderia = sc.nextLine();
		}

		switch (eleccion) {
		case 1:
			Futbol futbol = new Futbol(titular, text, precio, puntuacion, competicion, club, jugador);
			noticias.add(futbol);
			break;
		case 2:
			Basket basket = new Basket(titular, text, precio, puntuacion, competicion, club);
			noticias.add(basket);
			break;
		case 3:
			Tenis tenis = new Tenis(titular, text, precio, puntuacion, competicion, jugador);
			noticias.add(tenis);
			break;
		case 4:
			F1 f1 = new F1(titular, text, precio, puntuacion, escuderia);
			noticias.add(f1);
			break;
		default:
			Motociclismo moto = new Motociclismo(titular, text, precio, puntuacion, escuderia);
			noticias.add(moto);
		}
	}

	private static void eliminarRedactor(ArrayList<Redactor> redactores) {
		System.out.println("Introduce el nombre del redactor que quiere eliminar");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {
			System.out.println("El redactor no existe.");
		} else {
			System.out.println("Hemos eliminado> " + redactor.toString());
			redactores.remove(redactor);
		}
	}

	private static void altaRedactor(ArrayList<Redactor> redactores, ArrayList<Noticia> noticias) {
		System.out.println("Introduzca el nombre del redactor a dar de alta");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {

			System.out.println("Introduzca el dni del redactor: ");
			String dni = sc.nextLine();
			Noticia noticias1[] = {};
			Redactor redactor1 = new Redactor(nombre, dni, noticias1);
			redactores.add(redactor1);
		} else {
			System.out.println("El redactor ya existe.");
		}

	}

	private static Redactor buscadorRedactor(ArrayList<Redactor> redactores, String nombre) {
		int i = 0;
		int limite = redactores.size();
		Redactor redactor = null;
		while (i < limite && redactor == null) {
			if (redactores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				redactor = redactores.get(i);
			}
			i++;
		}
		return redactor;
	}

}
