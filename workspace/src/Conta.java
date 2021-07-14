
public class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	
	
}



