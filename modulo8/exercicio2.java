package lista1;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		float media;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		
		float nota1 = scanner.nextFloat();
		
		System.out.print("Digite a nota2: ");
		
		float nota2 = scanner.nextFloat();
		
		System.out.print("Digite a nota 3: ");
		
		float nota3 = scanner.nextFloat();
		
		System.out.print("Digite a nota4: ");
		
		float nota4 = scanner.nextFloat();
		
		media = nota1/4 + nota2/4 + nota3/4 + nota4/4;
		
		System.out.printf("A nota média foi de: "+media);
		
		scanner.close();
	}

}