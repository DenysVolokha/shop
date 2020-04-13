import java.io.*;
import java.util.ArrayList;

public class OrderPage {
    public static void main(String[] args) throws IOException {
        ArrayList<Product> finishPrice = new ArrayList<>();
        DataProduct catalog = new DataProduct();
        PayPayPal payProduct = new PayPayPal();
        payProduct.frontData();
        PayCreaditCard creaditCard = new PayCreaditCard();
        ArrayList<Product> list = (ArrayList<Product>) catalog.data();
        String line = "Select an item by id. The price is for 1 gram.";
        System.out.println(line);
        listProduct(list);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean repeat = true;
        while (repeat) {
                String id  = reader.readLine();
                int i = Integer.parseInt(id);
                for (Product product : list) {
                    if (product.id == i) {
                        System.out.println("Choose the number of grams you want to order.");
                        shoppingBasket(finishPrice, list, reader, i);
                    }
                   }
                System.out.println(" Do you want to continue shopping at the store y/n?");
                String answer = reader.readLine();
                switch (answer) {
                    case "y":
                        listProduct(list);
                        break;
                    case "n":
                        orderProcessing(finishPrice);
                        repeat = false;
                        String payment = reader.readLine();
                        switch (payment) {

                            case "credit card":
                                creaditCard.collectData();
                                break;
                            case "PayPal":
                                payProduct.collectData();
                        }
                }
        }


    }

    public static void shoppingBasket(ArrayList<Product> finishPrice, ArrayList<Product> list, BufferedReader reader, int i) throws IOException {
        String quantity = reader.readLine();
        float weight = Float.parseFloat(quantity);
        float price = list.get(i).price;
        String name = list.get(i).name;
        finishPrice.add(new Product(name, price, weight));
    }

    public static void orderProcessing(ArrayList<Product> finishPrice) {
        float d = 0;
        for (int f = 0; f < finishPrice.size(); f++)
        {
            System.out.print(finishPrice.get(f).name + " - ");
            System.out.print(finishPrice.get(f).price + "$" + " - ");
            System.out.println(finishPrice.get(f).weight + " gramm");
            d += finishPrice.get(f).price * finishPrice.get(f).weight;
        }
        System.out.println("Final cost - " + d + "$");
        System.out.println("Choose a payment method:");
        System.out.println("Credit card                 PayPal");
    }

    public static void listProduct(ArrayList<Product> list) {
        for (int i = 0; i<list.size();i++ )
        {
            System.out.print(list.get(i).id + " - ");
            System.out.print(list.get(i).name + " - ");
            System.out.println(list.get(i).price + "$");
        }
    }


}


