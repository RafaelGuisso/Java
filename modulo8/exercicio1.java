package lista1;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		float novo_salario;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		
		float salario = scanner.nextFloat();
		
		System.out.print("Digite o abono: ");
		
		float abono = scanner.nextFloat();
		
		novo_salario = salario+abono;
		
		System.out.printf("O novo salario é de: "+novo_salario);
		
		scanner.close();
	}

}
