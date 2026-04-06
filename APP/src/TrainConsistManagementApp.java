import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize train (empty list)
        ArrayList<String> train = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + train.size());

        // Display train consist
        System.out.println("Train consist: " + train);

        System.out.println("System ready for operations...");
    }
}
