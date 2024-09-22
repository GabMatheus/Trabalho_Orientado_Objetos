package cofrinho;

public class Dolar extends Moeda{
	
	//construtor para definir o valor da moeda
	public Dolar(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Moeda Dolar= " + valor);
		
	}
	
	public double converter() {
		return valor * 5.5;
	}

	
}
