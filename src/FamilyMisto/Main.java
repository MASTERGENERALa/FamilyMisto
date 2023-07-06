package FamilyMisto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> familyMap = new HashMap<>();

        // Введення пар місто-сім'я з клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < 3; i++) { // В даному прикладі вводимо 3 пари
                System.out.print("Введіть місто: ");
                String city = reader.readLine();
                System.out.print("Введіть сім'ю: ");
                String family = reader.readLine();
                familyMap.put(city, family);
            }

            // Введення міста для пошуку
            System.out.print("Введіть місто для пошуку: ");
            String searchCity = reader.readLine();

            // Виведення сім'ї, що живе у вказаному місті
            String family = familyMap.get(searchCity);
            if (family != null) {
                System.out.println(family);
            } else {
                System.out.println("Сім'ю не знайдено");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
