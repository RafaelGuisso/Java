package lista1;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		float liquido;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a salário bruto: ");
		
		float bruto = scanner.nextFloat();
		
		System.out.print("DigiteO adicional Noturno: ");
		
		float noturno = scanner.nextFloat();
		
		System.out.print("Digite o valor das horas extras: ");
		
		float extra = scanner.nextFloat();
		
		System.out.print("Digite os descontos: ");
		
		float desconto = scanner.nextFloat();
		
		liquido = bruto + noturno + (extra*5) - desconto;
		
		System.out.printf("Valor a receber: "+liquido);
		
		scanner.close();
	}

}