package firstprojetcteclipse;

import java.util.Scanner; //importando classe externa para receber entrada via teclado do usuário

public class PrimeiroPrograma {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double num1,num2,subtracao,soma, multi, divi;

		System.out.println("Digite um número");
		num1 = in.nextDouble();

		System.out.println("Digite outro numero");
		num2 = in.nextDouble();

		soma = num1 + num2;
		subtracao = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;

		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtração é: " + subtracao);
		System.out.println("O resultado da multiplicação é: " + multi);
		System.out.println("O resultado da divisão é: " + divi);


	}
}
