package n1ejercicio1;

public class TascaS1 {

	public static void main(String[] args) {
		InstrumentDeVent flauta = new InstrumentDeVent("flauta", 28);
		flauta.tocar();
//		se imprime primero static porque
//		en la clase instruments hay un static {}
//		y ejecuto una vez la clase instrumentos
//		porque ejecuto flauta.tocar(); que es instrumento
//		viento que es clase hija de instrumentos.
//		Seguido se imprime corchetes porque el c�digo se
//		lee de arriba a bajo y he escrito un sysout
//		corchetes dentro de estos {}

		InstrumentDeCorda guitarra = new InstrumentDeCorda("Guitarra", 49);
		System.out.println(guitarra.toString());
		// me vuelve a imprimir corchetes porque
		// instrumentsDeCorda es subclase tambien
		// de instruments
		// la frase "clase cuerda" es un sysout de
		// un static {} dentro de InstrumentDeCorda
	}

}
