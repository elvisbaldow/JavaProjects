package firstprojetcteclipse;
import java.util.Scanner;

public class calcSuper {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double num1, num2;
		num1 = 0;
		num2 = 0;
		
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		
		int i = in.nextInt();
		
		if(i>0 && i<5) {
			System.out.println("Digite o primeiro número");
			num1 = in.nextDouble();
		
			System.out.println("Digite o segundo número");
			num2 = in.nextDouble();
		} else {
			System.out.println("valor invalido");}
		
		
		if( i == 1) {
			System.out.println(num1 + num2);
		}else if (i == 2) {
			System.out.println(num1 - num2);
		}else if(i == 3) {
			System.out.println(num1 * num2);
		}else if(i == 4) {
			System.out.println(num1 / num2);
		}
	}
}
