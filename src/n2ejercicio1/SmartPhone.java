package n2ejercicio1;

public class SmartPhone extends Telefono implements Camara, Reloj{

	public SmartPhone(String marca, String model) {
		super(marca, model);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void alarma() {
		System.out.println("Est� sonant l�alarma");
	}


	@Override
	public void fotografiar() {
		System.out.println("S�est� fent una foto");		
	}
}
