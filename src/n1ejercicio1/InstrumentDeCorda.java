package n1ejercicio1;

public class InstrumentDeCorda extends Instruments {

	public InstrumentDeCorda(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	static {
		System.out.println("clase cuerda");
	}

	@Override
	public void tocar() {
		System.out.println("Esta sonando un instrumento de cuerda");
	}

	@Override
	public String toString() {
		return "InstrumentDeCorda [getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}

}
