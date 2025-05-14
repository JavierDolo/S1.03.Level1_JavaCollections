package exercise_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final CountriesCapital service;
    private final Scanner scanner;

    public Game(CountriesCapital service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Introduce tu nombre");
        String userName = scanner.nextLine();
        System.out.println("Te preguntare 10 capitales de paises");
        int score = 0;
        List<String> randomCountries = service.getRandomCountries(10);

        int numberQuestion = 1;
        for (String country : randomCountries) {
            System.out.println("Pregunta nº " + numberQuestion);
            System.out.println("¿Cual es la capital de " + country + "?");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(service.getCountriesCapitalMap().get(country))) {
                System.out.println("¡Correcto!");
                score++;
            } else {
                System.out.println("Incorrecto. La capital es: " + service.getCountriesCapitalMap().get(country));
            }
            numberQuestion++;
        }
        System.out.println(userName + ", tu puntuacion es: " + score + "/10");
        saveScore(userName, score);
    }

    private void saveScore(String userName, int score) {
        try (FileWriter fileWriter = new FileWriter("scores.txt", true)) {
            fileWriter.write(userName + ": " + score + "/10\n");
        } catch (IOException e) {
            System.out.println(" Error al guardar el score: " + e.getMessage());
        }
    }

}
