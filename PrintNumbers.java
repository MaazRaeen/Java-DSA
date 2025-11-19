public class PrintNumbers {
    public static void main(String[] args) {

        int n = 100;

        System.out.println("Starting to print from 1 to " + n + "...");

        long startTime = System.currentTimeMillis(); 

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis(); 

        System.out.println("Finished printing.");
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}