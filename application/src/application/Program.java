package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos? ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        System.out.println();
        System.out.println("--- Produtos ---");
        System.out.println();
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite o produto: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Digite o preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.println();
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}