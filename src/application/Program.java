package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		/* O programa consiste em ler um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcula e 
		mostra o valor que esta pessoa deve pagar de Imposto de Renda, segundo os dados abaixo. 
				
				Renda
				- de 0.0 a R$ 2000.00 = Isento de imposto;
				- de R$2000.01 a R$3000.00 = Imposto de 8%;
				- de R$3000.01 a R$4500.00 = Imposto de 18%;
				- acima de R$4500.00 = Imposto de 28%;
				
				Se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido, a taxa é 
		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
		*/
				
				double salario = t.nextDouble();
				double imposto;
				
				if(salario <= 2000.0) {
					imposto = 0.0;
				}
				else if(salario <= 3000.0) {
					imposto = (salario - 2000.0) * 0.08;
				}
				else if(salario <= 4500) {
					imposto = (salario - 3000.0) * 0.18 + 1000 * 0.08;
				}
				else {
					imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
				}
				
				if(imposto == 0.0) {
					System.out.println("Isento.");
				}
				else {
					System.out.printf("Imposto: R$ %.2f", imposto);
				}

	}

}
