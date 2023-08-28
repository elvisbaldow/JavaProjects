package firstprojetcteclipse;
import java.util.Scanner;

public class medianotes {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		double nota1, nota2, nota3, nota4, notafinal;
	
	System.out.println("Digite a nota da prova A");
	nota1 = in.nextDouble();
	
	System.out.println("Digite a nota da prova B");
	nota2 = in.nextDouble();
	
	System.out.println("Digite a nota da prova C");
	nota3 = in.nextDouble();
	
	System.out.println("Digite a nota da prova D");
	nota4 = in.nextDouble();
	
	notafinal = (nota1 + nota2 + nota3 + nota4 ) /4;
	
	// System.out.println("Sua nota final é: " + notafinal);
	
	if (notafinal >= 7) {
		System.out.println("Parabéns, vc foi aprovado! - Sua média foi de: " + notafinal);}
	else {
			System.out.println("Você está reprovado(a)! - Sua média foi de:" + notafinal);
		}
	}
}

