
import java.util.*;

public class SortFruite {

    public static int solveFruitFrequency(String s) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int maxOddFreq = Integer.MIN_VALUE;
        int minEvenFreq = Integer.MAX_VALUE;

        // Separate odd and even frequencies
        for (int count : freqMap.values()) {

            if (count % 2 == 0) {
                minEvenFreq = Math.min(minEvenFreq, count);
            } else {
                maxOddFreq = Math.max(maxOddFreq, count);
            }
        }

        // Calculate absolute difference
        return Math.abs(maxOddFreq - minEvenFreq);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(solveFruitFrequency(s));

        sc.close();
    }
}
