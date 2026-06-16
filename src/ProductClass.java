public class ProductClass {
    private String name;
    private String location;
    private double weight;


    public ProductClass(String name){
        this.name=name;
        this.location="shelf";
        this.weight=1;


    }

    public ProductClass(String name, String location){
        this.name=name;
        this.location=location;
        this.weight=1;
    }

    public ProductClass(String name, int weight){
            this.name=name;
            this.weight=weight;
            this.location="shelf";
    }


    public String toString() {
       return this.name + " "  + this.weight + "kg" + " can be found from the " + this.location;

    }

}


class ProgramClassMain{
    public static void main(String[] args) {
        ProductClass product= new ProductClass("shirt");
        ProductClass socks= new ProductClass("capes", "nairobi" );
        ProductClass cups= new ProductClass("kaulo", 4);

        System.out.println(product);
        System.out.println(socks);
        System.out.println(cups);
    }
}
