package intites;
//Essa classe tem por objetivo executar uma operação de estoque.
//Realizando entrada e saida de produtos e sua quantidade.
public class Product {
    //Atributos da classe.
    public String name;
    public double price;
    public int quantity;

    //Funções da classe.
    public double totalValueInStock(){

        return price * quantity;
    }
    public void addProducts (int quantity){
        this.quantity += quantity;
        /*A palavra reservada this é usada para se referir ao atributo da minha classe.
         * o quantity qeu fou declarado no inicio.*/
    }
    public void removeProducts (int quantity){

        this.quantity -= quantity;
    }
    public String toString() {
        //sobrepondo o toString padrão, usando um novo toString.
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units , total: $" + String.format("%.2f", totalValueInStock());
        /*Dessa forma toda vez que declararmos product.toString(); o nome do produto é declarado.*/
        //No return ja vai retornar com todas as atribuições que declaramos acima, quadno chamarmos o metodo product.toString.
    }
}
