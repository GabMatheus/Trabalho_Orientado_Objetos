package cofrinho;

public class Real extends Moeda {

	//construtor para definir o valor da moeda
	public Real(double valor) {
		super(valor);
	}

	
	@Override
	void info() {
		System.out.println("Moeda Real= " + valor);
		
	}

	public double converter() {
		return valor * 1.0;
	}
	
	
}
