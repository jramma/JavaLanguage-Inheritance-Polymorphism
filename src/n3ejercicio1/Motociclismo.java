package n3ejercicio1;

public class Motociclismo extends Noticia{
	private String equipo;

	public Motociclismo(String titular, String text, int puntuacion, int precio, String equipo) {
		super(titular, text, puntuacion, precio);
		this.equipo = equipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
		return "Motociclismo [equipo=" + equipo + "]";
	}

	@Override
	public void calcularNoticia() {
		int precio = 100;

		if (equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")) {
			precio = precio + 50;
		}
		System.out.println("La noticia cuesta " + precio + " euros.");
		setPrecio(precio);

	}

	@Override
	public void calcularPuntuacion() {
		int puntuacion = 3;

		if (equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")) {
			puntuacion+=3;
		}
		System.out.println("La puntuacion es> " + puntuacion + " .");
		setPuntuacion(puntuacion);
	}
	
	
	
}
