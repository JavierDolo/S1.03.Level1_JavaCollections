package exercise_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountriesCapital {
    private HashMap<String, String> countriesCapitalMap = new HashMap<>();
    String filePath = "C:\\Users\\Javierdorado\\IdeaProjects\\S1.03.Level1_JavaCollections\\src\\Resources\\Countries.txt";

    public void loadData(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    countriesCapitalMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            if (countriesCapitalMap.isEmpty()) {
                System.out.println("Error loading data ");
            }

        } catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());
        }
    }

    public HashMap<String, String> getCountriesCapitalMap() {
        return countriesCapitalMap;
    }
    public List<String> getRandomCountries(int count) {
        List<String> countries = new ArrayList<>(countriesCapitalMap.keySet());
        Collections.shuffle(countries);
        return countries.subList(0, Math.min(count, countries.size()));
    }
}