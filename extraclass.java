public class extraclass Solution {
    public void printNos(int n) {
        // Code here
        if (n=0) return;
        printNos(n-1);
    }
    printNos(n);
}
{
    public static void fun(int n) {
        if (n == 0)
            return;

        System.out.print(n % 2);
        fun(n / 2);
    }

    public static void main(String[] args) {
        fun(10); // Example call
    }
}
