package n1ejercicio1;

public abstract class Instrument {
	private String nombre;
	private int precio;

	{
		System.out.println("corchetes");
	}
	static {
		System.out.println("static");
	}

	public Instruments(String nombre, int precio) {

		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public abstract void tocar();

}
