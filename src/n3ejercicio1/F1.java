package n3ejercicio1;

public class F1 extends Noticia {
	private String escuderia;

	public F1(String titular, String text, int puntuacion, int precio, String escuderia) {
		super(titular, text, puntuacion, precio);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	@Override
	public String toString() {
		return "F1 [escuderia=" + escuderia + "]";
	}

	@Override
	public void calcularNoticia() {
		int precio = 100;

		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
			precio = precio + 50;
		}
		System.out.println("La noticia cuesta " + precio + " euros.");
		setPrecio(precio);

	}

	@Override
	public void calcularPuntuacion() {
		int puntuacion = 4;

		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
			puntuacion+=2;
		}
		System.out.println("La puntuacion es>" + puntuacion + " .");
		setPuntuacion(puntuacion);

		
	}

}
