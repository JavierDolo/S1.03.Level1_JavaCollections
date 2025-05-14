package exercise_3;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Javierdorado\\IdeaProjects\\S1.03.Level1_JavaCollections\\src\\Resources\\countries.txt";
        CountriesCapital service = new CountriesCapital();
        //"C:\\Users\\Javierdorado\\IdeaProjects\\S1.03.Level1_JavaCollections\\src\\Resources\\countries.txt"
        try {
            service.loadData(filePath);
            Game game = new Game(service);
            game.startGame();
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
        }

    }
}
