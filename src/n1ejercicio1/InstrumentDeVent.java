package n1ejercicio1;

public class InstrumentDeVent extends Instrument {

	public InstrumentDeVent(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Est� sonando un instrumento de viento");
	}

}
