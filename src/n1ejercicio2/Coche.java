package n1ejercicio2;

public class Coche {
	private static final String marca = "zeat";
	private static String modelo;
	private final int potencia;

	public Coche(int potencia) {
		this.potencia = potencia;
	}

	{
		System.out.println(Coche.modelo);
		System.out.println(Coche.marca);
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public static void frenar() {
		System.out.println("Esta frenando");
	}

	public void acelerar() {
		System.out.println("Esta acelerando");

	}

	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + " modelo = "+modelo+" marca = "+marca+"]";
	}

}
