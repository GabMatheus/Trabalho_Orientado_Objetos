package cofrinho;

//criação da classe abstrata para poder aplicar o polimorfismo
//dentro das outras classes de moedas especificas, e herança tambem.
public abstract class Moeda {
	
	public double valor;
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	abstract void info();
	abstract double converter();
	
}
