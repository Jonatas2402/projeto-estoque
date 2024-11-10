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

        System.out.print(product.name + "," + product.price + "," + product.quantity);

        sc.close();
    }
}