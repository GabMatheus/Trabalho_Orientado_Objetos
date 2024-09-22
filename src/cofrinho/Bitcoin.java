package cofrinho;

public class Bitcoin extends Moeda{
	
	//construtor para definir o valor da moeda
	public Bitcoin(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Moeda Digital Bitcoin= " + valor);
		
	}
	
	public double converter() {
		return valor * 345059.40; 
	}

}
