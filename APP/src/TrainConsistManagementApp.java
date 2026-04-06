import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Add Passenger Bogies to Train ===");

        // Create train list
        ArrayList<String> train = new ArrayList<>();

        // Add bogies
        train.add("AC Chair");
        train.add("Sleeper");
        train.add("General");

        // Display after adding
        System.out.println("Train after adding bogies: " + train);

        // Remove a bogie
        train.remove("AC Chair");
        System.out.println("After removing 'AC Chair': " + train);

        // Check if bogie exists
        if (train.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Final list
        System.out.println("Final train consist: " + train);
    }
}
