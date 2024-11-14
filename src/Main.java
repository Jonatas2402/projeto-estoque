import entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Insira os dados do produto: ");
        System.out.print("name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("quantidade em estoque: ");
        product.quantity= sc.nextInt();
        //Utilizadno toString.

        System.out.printf("");
        System.out.println("Product data: " + product);//nessa situação não precisamos declarar o toString, o java entende o contexto e imprime o nome do produto, declarado em toString.
        //quando declaramos product.toString, ele imprimirá o nome do produto, como nós declaramos.

        System.out.printf("");
        System.out.print("entre com um número de produtos para adicionar no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.printf("");
        System.out.println("updated data: " + product);

        System.out.printf("");
        System.out.print("Entre com a quantidade retirada do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.printf("");
        System.out.println("exit data: " + product);
        sc.close();
    }
}