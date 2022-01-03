package entities;

public class Empregado {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double perc) {
		salarioBruto = salarioBruto + (salarioBruto)/100 * perc;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
