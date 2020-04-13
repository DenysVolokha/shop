public class Product {
        String name;
        float price ;
        int id  ;
        float weight;
        static int autoid = 0;


    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        this.id =++ autoid;

}
    public Product (String name, float price, float weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}

