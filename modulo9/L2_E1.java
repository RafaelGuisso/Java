package lista2;

import java.util.Scanner;

public class L2_E1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero 1: ");
		
		float n1 = scanner.nextFloat();
		
		System.out.print("Digite o numero 2: ");
		
		float n2 = scanner.nextFloat();
		
		System.out.print("Digite o numero 3: ");
		
		float n3 = scanner.nextFloat();
		
		if (n1 + n2 > n3) {
			System.out.print("A Soma de A + B é Maior do que C");
		}
			
		else if  (n1 + n2 < n3) {
				System.out.print("A Soma de A + B é Menor do que C");
		}
				
		else {
			System.out.print("A Soma de A + B é Igual a C");
			}
			
		
		scanner.close();
	}

}