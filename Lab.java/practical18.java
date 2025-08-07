import java.util.Scanner;

public class practical18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        
        int[] freq = new int[256]; 

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int maxFrequency = -1;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxFrequency) {
                maxFrequency = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
    }
}
