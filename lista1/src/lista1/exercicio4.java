package lista1;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		float calculo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero 1: ");
		
		float nota1 = scanner.nextFloat();
		
		System.out.print("Digite o numero 2: ");
		
		float nota2 = scanner.nextFloat();
		
		System.out.print("Digite o numero 3: ");
		
		float nota3 = scanner.nextFloat();
		
		System.out.print("Digite o numero 4: ");
		
		float nota4 = scanner.nextFloat();
		
		calculo = (nota1 * nota2) - (nota3 * nota4);
		
		System.out.printf("A nota média foi de: "+calculo);
		
		scanner.close();
	}

}