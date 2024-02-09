package modulo10;

import java.util.Scanner;

public class FOR_2 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int impar = 0;
        int par = 0;
        int numero = 0;
        
    	System.out.println("Esse programa analisa 10 números e diz quais são pares e ímpares \n");
    	
    	
		for (int i=1; i<=10; i++) {
			numero = scanner.nextInt();
			if (numero % 2 == 0) {
				par++;
			}	else {
					impar++;
				}
			}
		
			System.out.println("Total de pares:  " + par);
			System.out.println("Total de impares:  " + impar);

        scanner.close();
    }
}