import java.util.ArrayList;
import java.util.List;

public class DataProduct
{
    List<Product> data()
    {
        ArrayList<Product> list = new ArrayList<>();
        list.add( new Product("Lsd" , 15.2f ));
        list.add( new Product("Cocaine" , 32.2f ));
        list.add( new Product("Geroine" , 48.57f ));
        list.add( new Product("Extesi" , 28f ));
        list.add( new Product("Gash" , 15.2f ));
        list.add( new Product("Ganja" , 12.2f ));
        list.add( new Product("Morfine" , 27.4f ));
        list.add( new Product("Amfitamit" , 33.4f ));
        list.add( new Product("Creck" , 23.4f ));
        list.add( new Product("Dmt" , 50f ));

            return list;

    }

}
