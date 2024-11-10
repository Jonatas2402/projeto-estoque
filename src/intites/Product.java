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
}
