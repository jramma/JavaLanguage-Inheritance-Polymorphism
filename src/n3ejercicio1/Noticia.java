package n3ejercicio1;

public abstract class Noticia {
	private String titular;
	private String text="";
	private int puntuacion;
	private int precio;

	

	public Noticia(String titular) {
		
		this.titular = titular;
	}


	public Noticia(String titular, String text, int puntuacion, int precio) {
		this.titular = titular;
		this.text = text;
		this.puntuacion = puntuacion;
		this.precio = precio;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Noticia [titular=" + titular + ", text=" + text + ", puntuacion=" + puntuacion + ", precio=" + precio
				+ "]";
	}


	public abstract void calcularNoticia();
	public abstract void calcularPuntuacion();







}
