package n3ejercicio1;

public class Futbol extends Noticia {
	private String competicion;
	private String club;
	private String jugador;

	public Futbol(String titular, String text, int puntuacion, int precio, String competicion, String club,
			String jugador) {
		super(titular, text, puntuacion, precio);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "Futbol [competicion=" + competicion + ", club=" + club + ", jugador=" + jugador + "]";
	}

	@Override
	public void calcularNoticia() {
		int precio = 300;
		if (competicion.equalsIgnoreCase("Lliga de Campions")) {
			precio = precio + 100;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			precio = precio + 100;
		}
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			precio = precio + 50;
		}
		System.out.println("La noticia cuesta "+precio+" euros.");
		setPrecio(precio);
	}

	@Override
	public void calcularPuntuacion() {
		int puntuacion=5;
		if(competicion.equalsIgnoreCase("Lliga de Campions")) {
			puntuacion+=3;
		}else if (competicion.equalsIgnoreCase("Lliga")) {
			puntuacion+=2;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			puntuacion+=1;
		}
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			puntuacion+=1;
		}
		setPuntuacion(puntuacion);
		System.out.println("Puntuacion es: "+puntuacion);
	}

}
