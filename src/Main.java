import intites.Product;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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
        //Utilizadno toString. ele serve para converter o objeto para String.


        System.out.println(product);//nessa situação não precisamos declarar o toString, o java entende o contexto e imprime o nome do produto, declarado em toString.
        //quando declaramos product.toString, ele imprimirá o nome do produto, como nós declaramos.

        sc.close();
    }
}