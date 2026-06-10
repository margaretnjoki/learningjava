public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name=  name;
        this.price=price;
        this.quantity=quantity;
    }

    public void printProduct(){
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
        }
    }


class PrintProduct{
    public static void main(String[] args) {
        Product  product= new Product("banana", 5.0, 10);
        product.printProduct();

    }
}
