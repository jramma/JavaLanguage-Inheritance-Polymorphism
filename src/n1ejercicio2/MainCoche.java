package n1ejercicio2;

public class MainCoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche(120);
		Coche coche2 = new Coche(75);
		coche1.acelerar();
		Coche.frenar();
		System.out.println(Coche.getMarca());
		Coche.setModelo("ibiza");
		System.out.println("----------------");
		System.out.println(Coche.getModelo());
		System.out.println(coche1);
		System.out.println(coche2.toString());
		System.out.println("----------------------");
		{
			// cambio el modelo en todos los coches
			Coche.setModelo("Toledo");
		}

		System.out.println(coche2.toString());
		System.out.println(coche1);

		// frenar es static en la clase coche as� que para invocar
		// el m�todo frenar() no necesito
		// declarar un coche, en cambio el metodo acelerar no.

		// static : en el momento que declare el modelo todos
		// compartiran el mismo modelo (clase coche)
		// static final : todos comparten la misma
		// marca y adem�s no se puede cambiar
		// si puedo hacer .setModelo() porque no es final, es
		// unicamente static
		// NO puedo hacer .setMarca
	}

	static {
		Coche.getMarca();
	}
}
