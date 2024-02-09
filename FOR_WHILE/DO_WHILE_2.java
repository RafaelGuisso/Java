package modulo10;

import java.util.Scanner;

public class DO_WHILE_2 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;
        float media;
        
        System.out.println("Esse programa recebe vários valores e ao final mostra a média dos valores diviziveis por 3");
        System.out.println("Para sair, digite 0 ");
        
        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
        	if (numero % 3 == 0) {
        		soma = soma + numero;
        		contador++;}
            
        
        } while (numero != 0); {
        }
        
        
        // Encontrei um problema nesta etapa nas minhas primeiras iterações do codigo
        // Quando o número 0 era digitado ele adicionava +1 ao contador, gerando um erro na hora do calculo da média
        // De fato, 0/3 possui resto zero
        // Mas ele não deve entrar no calculo ja que ele está sendo utilizado como finalizador do código, não como um dos números somados
        // Tentei colocar a variavel contador começando com o valor -1, mas isso gerava bugs, principalmente quando eu começava o codigo já digitando o zero
        // Pra solucionar eu optei por diminuir 1 do contador uma vez que o programa sai do loop do while
        
        contador = contador -1;
        media = soma/(contador);
        
        // System.out.println("Soma: " + soma + "contagem: " + contador );
        
        System.out.println("A média dos números diviziveis por 3  é \n" + media);
        
        
        scanner.close();
        	
        }
	}