import java.util.HashMap;
import java.util.Map;

public class ElementFrequencies {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20,8,9,9,9, 10, 10, 20, 5, 20};
        printElementFrequencies(arr);
    }

    public static void printElementFrequencies(int[] arr) {
        // Create a HashMap to store the frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and update frequencies in the HashMap
        for (int i : arr) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        // Print the elements and their frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
