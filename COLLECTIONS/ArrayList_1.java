package Collections;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> cores = new HashSet<String>();

        System.out.println("Esse programa recebe 5 cores e as ordena alfabeticamente");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Adicione a cor #" + (i + 1));
            cores.add(scanner.next());
        }

        Set<String> sortedCores = new TreeSet<>(cores);

        System.out.println("Cores ordenadas alfabeticamente:");
        for (String cor : sortedCores) {
            System.out.println(cor);
        }

        scanner.close();
    }
}
