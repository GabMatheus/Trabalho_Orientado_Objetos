package cofrinho;

public class Euro extends Moeda {
	
	//construtor para definir o valor da moeda
	public Euro(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Moeda Euro= " + valor);
		
	}
	
	public double converter() {
		return valor * 6.6;
	}

	
}
