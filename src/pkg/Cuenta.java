package pkg;


public class Cuenta {
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.saldo = saldo;
	}
	double saldo;
	
	public double getSaldo() {
		return 1000;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Retirar(double i) {
		if(i <= this.saldo)
			this.saldo=i;
	}
	
	public void Ingresar(int i) {
	
		this.setSaldo(this.getSaldo()+i);
	}

}
