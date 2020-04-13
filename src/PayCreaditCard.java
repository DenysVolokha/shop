import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PayCreaditCard implements Pay
{
    ArrayList<CreditCard> creditCards = new ArrayList<>();

    @Override
    public void pay() {

    }

    @Override
    public void collectData() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter credit card number");
        String numberCard = reader.readLine();
        System.out.println("Enter CVV/CVC number");
        String cw = reader.readLine();
        System.out.println("Enter expires end month/year");
        String expriresEnd = reader.readLine();
        creditCards.add(new CreditCard(numberCard, cw, expriresEnd, 2342.454f));




    }
}
