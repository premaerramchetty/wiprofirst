package WIRPO;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> cities = new HashSet<>();
        
        // Add five city names to the set, including a duplicate
        cities.add("Tokyo");
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo"); // Duplicate entry
        
        // Display the elements to show duplicates are not allowed
        System.out.println("Cities in the HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
        
        // Check if a particular city exists in the set
        String checkCity = "London";
        if (cities.contains(checkCity)) {
            System.out.println(checkCity + " exists in the set.");
        } else {
            System.out.println(checkCity + " does not exist in the set.");
        }
        
        // Remove a city and display the updated set
        cities.remove("Paris");
        System.out.println("Updated HashSet after removing Paris:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
