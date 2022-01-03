package entities;

public class Conta {

	private int numConta;
	private String nome;
	private double saldo;
	
	public Conta(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		depositarValor(depositoInicial);
	}
	
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}	
	
	public void depositarValor(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void sacarValor(double saque) {
		saldo = saldo - saque - 5.00;
	}
	
	public String toString() {
		return "Account " 
				+ getNumConta() 
				+ ", Holder: " 
				+ getNome() 
				+ ", Balance: $ " 
				+ String.format("%.2f", getSaldo());
	}
	
}
