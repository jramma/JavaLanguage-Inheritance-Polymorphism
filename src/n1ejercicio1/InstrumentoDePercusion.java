package n1ejercicio1;

public class InstrumentoDePercusion extends Instruments {

	public InstrumentoDePercusion(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Esta sonando un instrumento de percusi�n");
	}

}
