package n3ejercicio1;

public class Basket extends Noticia{
	private String competicion;
	private String club;
	
	public Basket(String titular, String text, int puntuacion, int precio, String competicion, String club) {
		super(titular, text, puntuacion, precio);
		this.competicion = competicion;
		this.club = club;
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

	@Override
	public String toString() {
		return "Basket [competicion=" + competicion + ", club=" + club + "]";
	}

	@Override
	public void calcularNoticia() {
		int precio = 250;
		if (competicion.equalsIgnoreCase("Eurolliga")) {
			precio = precio + 75;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			precio = precio + 75;
		}
		
		System.out.println("La noticia cuesta "+precio+" euros.");
		setPrecio(precio);

	}

	@Override
	public void calcularPuntuacion() {
		int puntuacion = 4;
		if (competicion.equalsIgnoreCase("Eurolliga")||competicion.equalsIgnoreCase("ACB")) {
			puntuacion = puntuacion + 3;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			puntuacion = puntuacion + 1;
		}
		
		System.out.println("Puntuacion de la noticia > "+puntuacion+" .");
		setPuntuacion(puntuacion);
		
	}
		
	
}


