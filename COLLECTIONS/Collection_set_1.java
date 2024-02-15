package Collections;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Collection_set_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<Integer>();

        System.out.println("This code receives an input of 10 numbers and orders them");

        for (int i = 0; i < 10; i++) {
            System.out.println("Add the #" + (i + 1) + " number:");
            numbers.add(scanner.nextInt());
        }

        Set<Integer> sortedNumbers = new TreeSet<>(numbers);

        System.out.println("Ordered numbers using Iterator:");

        Iterator<Integer> iterator = sortedNumbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

        scanner.close();
    }
}