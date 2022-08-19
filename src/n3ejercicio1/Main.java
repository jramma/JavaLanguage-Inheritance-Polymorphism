package n3ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// este ejercicio aún no está acabado

		ArrayList<Redactor> redactores = new ArrayList<Redactor>();
		int eleccion = 0;
		do {
			System.out.println("--------------------------------------");
			System.out.println("Esculli una opci� (1/8):");
			System.out.println("1.- Introduir redactor.");
			System.out.println("2.- Eliminar redactor.");
			System.out.println("3.- Introduir not�cia a un redactor.");
			System.out.println("4.- Eliminar not�cia.");
			System.out.println("5.- Mostrar totes les not�cies per redactor.");
			System.out.println("6.- Calcular puntuaci� de la not�cia.");
			System.out.println("7.- Calcular preu-not�cia.");
			System.out.println("8.- Eixir.");
			eleccion = sc.nextInt();
			sc.nextLine();

			menu(redactores, eleccion);
		} while (eleccion != 8);
	}

	private static void menu(ArrayList<Redactor> redactores, int eleccion) {

		switch (eleccion) {
		case 1:
			altaRedactor(redactores);
			break;
		case 2:
			eliminarRedactor(redactores);
			break;
		case 3:
			introducirNoticiaAUnRedactor(redactores);
			break;
		case 4:
			eliminarNoticia(redactores);
			break;
		case 5:
			mostrarNoticias(redactores);
			break;
		case 6:
			calcularPuntuacionNoticia(redactores);
			break;
		case 7:
			calcularPrecioNoticia(redactores);
			break;
		case 8:
			System.out.println("Eixint.");
		default:
			if (eleccion != 8)
				System.out.println("Introduce un valor entre 1 y 8");

		}
	}

	private static void calcularPrecioNoticia(ArrayList<Redactor> redactores) {
		System.out.println("introduce el redactor del que desea calcular precio de la noticia:");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {
			System.out.println("El redactor no existe");
		} else {
			Noticia noticia = buscadorNoticia(redactor.getNoticias());

			noticia.calcularNoticia();
		}
	}

	private static void calcularPuntuacionNoticia(ArrayList<Redactor> redactores) {
		System.out.println("introduce el redactor del que desea calcular puntuación de la noticia:");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {
			System.out.println("El redactor no existe");
		} else {
			Noticia noticia = buscadorNoticia(redactor.getNoticias());

			noticia.calcularPuntuacion();
		}
	}

	private static void mostrarNoticias(ArrayList<Redactor> redactores) {
		System.out.println("introduce el redactor del que desea ver la noticia:");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor != null) {
			for (int i = 0; i < redactor.getNoticias().size(); i++) {
				Noticia noticia = redactor.getNoticias().get(i);
				System.out
						.println(noticia.getTitular().toString() + "\n *************** \n" + noticia.getText().toString());
				System.out.println("\n \n ++++++++++++++++++++++++++++++++++");
			}
		}
		System.out.println("----cerrando Mostrar noticia----");
		System.out.println("\n\n\n");
	}

	private static void eliminarNoticia(ArrayList<Redactor> redactores) {
		System.out.println("Introduce el nombre del redactor que tiene la noticia:");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {
			System.out.println("el redactor no existe!!!");
		} else {
			Noticia noticia = buscadorNoticia(redactor.getNoticias());
			if (noticia == null) {
				System.out.println("La noticia no existe");
			} else {
				System.out.println("La siguiente noticia ha sido eliminada: \n" + noticia.toString());
				redactor.getNoticias().remove(noticia);

			}
		}
	}

	private static Noticia buscadorNoticia(ArrayList<Noticia> noticias) {
		System.out.println("Introduce el titular de la noticia");
		String nombre = sc.nextLine();
		int i = 0;
		int limite = noticias.size();
		Noticia noticia = null;
		while (i < limite && noticia == null) {
			i++;
			if (noticias.get(i - 1).getTitular().equalsIgnoreCase(nombre)) {
				noticia = noticias.get(i - 1);
			}

		}

		return noticia;
	}

	private static void introducirNoticiaAUnRedactor(ArrayList<Redactor> redactores) {
		System.out.println("�A que' redactor desea introducir la noticia?");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {
			System.out.println("El redactor no existe");
		} else {
			tipoNoticia(redactor);
			System.out.println("La noticia ha sido introducida. ");
		}
	}

	private static void tipoNoticia(Redactor redactor) {
		System.out.println("�cu�l es el titular de la noticia?");
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
			redactor.getNoticias().add(futbol);

			break;
		case 2:
			Basket basket = new Basket(titular, text, precio, puntuacion, competicion, club);
			redactor.getNoticias().add(basket);
			break;
		case 3:
			Tenis tenis = new Tenis(titular, text, precio, puntuacion, competicion, jugador);
			redactor.getNoticias().add(tenis);
			break;
		case 4:
			F1 f1 = new F1(titular, text, precio, puntuacion, escuderia);
			redactor.getNoticias().add(f1);
			break;
		default:
			Motociclismo moto = new Motociclismo(titular, text, precio, puntuacion, escuderia);
			redactor.getNoticias().add(moto);
		}

		System.out.println("Noticia añadida!");
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

	private static void altaRedactor(ArrayList<Redactor> redactores) {
		System.out.println("Introduzca el nombre del redactor a dar de alta");
		String nombre = sc.nextLine();
		Redactor redactor = buscadorRedactor(redactores, nombre);
		if (redactor == null) {

			System.out.println("Introduzca el dni del redactor: ");
			String dni = sc.nextLine();
			ArrayList<Noticia> noticias = new ArrayList<Noticia>();
			Redactor redactor1 = new Redactor(nombre, dni, noticias);
			redactores.add(redactor1);
		} else {
			System.out.println("El redactor ya existe.");
		}
		System.out.println("Redactor añadido ! ! ! ! ! ! !");

	}

	private static Redactor buscadorRedactor(ArrayList<Redactor> redactores, String nombre) {
		int i = 0;
		int limite = redactores.size();
		Redactor redactor = null;
		while (i < limite && redactor == null) {
			i++;
			if (redactores.get(i - 1).getNombre().equalsIgnoreCase(nombre)) {
				redactor = redactores.get(i - 1);
			}
		}
		return redactor;
	}

}
