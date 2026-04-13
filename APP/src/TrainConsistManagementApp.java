import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(bogie -> bogie.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("=== UC7: Sort Bogies by Capacity ===");
        List<Bogie> sortedBogies = new ArrayList<>(bogies);
        sortedBogies.sort(Comparator.comparingInt(bogie -> bogie.capacity));

        for (Bogie bogie : sortedBogies) {
            System.out.println(bogie);
        }

        System.out.println();
        System.out.println("=== UC8: Filter Passenger Bogies Using Streams ===");
        List<Bogie> filteredBogies = filterBogiesByCapacity(bogies, 60);

        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }
    }
}
