import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PayPayPal implements Pay {
    HashMap<String, String> collectDataHashMap = new HashMap<>();

    void frontData() {
        collectDataHashMap.put("1", "2");
        collectDataHashMap.put("obdolbish@gmail.com", "bulbul9tor");
        collectDataHashMap.put("travushka@gmail.com", "buravushka");
    }

    @Override
    public void pay() {

    }

    @Override
    public void collectData() throws IOException {
        BufferedReader readers = new BufferedReader(new InputStreamReader(System.in));
        boolean repyt = true;
        while (repyt) {
            System.out.println("Enter you email");
            String email = readers.readLine();
            if (collectDataHashMap.containsKey(email)) {
                System.out.println("Enter you password");
                String password = readers.readLine();
                if (collectDataHashMap.get(email).equals(password)) {
                   System.out.println("User found");
                   readers.close();
                    repyt = false;
                }
                else {
                    System.out.println("Incorrect password");
                }
            }
            else {
                System.out.println("Incorrect email");
            }

        }
    }





    }


