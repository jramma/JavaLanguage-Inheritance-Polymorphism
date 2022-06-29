package n3ejercicio1;

public class Tenis extends Noticia {
	private String competicion;
	private String tenistas;

	public Tenis(String titular, String text, int puntuacion, int precio, String competicion, String tenistas) {
		super(titular, text, puntuacion, precio);
		this.competicion = competicion;
		this.tenistas = tenistas;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getTenistas() {
		return tenistas;
	}

	public void setTenistas(String tenistas) {
		this.tenistas = tenistas;
	}

	@Override
	public String toString() {
		return "Tenis [competicion=" + competicion + ", tenistas=" + tenistas + "]";
	}

	@Override
	public void calcularNoticia() {
		int precio = 150;

		if (tenistas.equalsIgnoreCase("Nadal") || tenistas.equalsIgnoreCase("Federer")
				|| tenistas.equalsIgnoreCase("Djokovic")) {
			precio = precio + 100;
		}
		System.out.println("La noticia cuesta " + precio + " euros.");
		setPrecio(precio);

	}

	@Override
	public void calcularPuntuacion() {
		int puntuacion = 4;

		if (tenistas.equalsIgnoreCase("Nadal") || tenistas.equalsIgnoreCase("Federer")
				|| tenistas.equalsIgnoreCase("Djokovic")) {
			puntuacion += 3;
		}
		System.out.println("Puntuacion noticia> " + puntuacion + " .");
		setPuntuacion(puntuacion);
		
	}

}
