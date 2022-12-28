package nonrecursivefibo;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Recursive");
        Instant beforefibo = Instant.now();
        System.out.println(fibo(40));
        Instant afterfibo = Instant.now();
        long recursiveTime = Duration.between(beforefibo, afterfibo).toMillis();
        System.out.println("Total time in milliseconds:" + recursiveTime);
        System.out.println("Non recursive");
        Instant before_non_recursive_fibo = Instant.now();
        System.out.println(nrfibo(40));
        Instant after_non_recursive_fibo = Instant.now();
        long nonRecursiveTime = Duration.between(before_non_recursive_fibo, after_non_recursive_fibo).toMillis();
        System.out.println("Total time in milliseconds:" + nonRecursiveTime);
        String precentage = NumberFormat.getPercentInstance().format((double) recursiveTime / nonRecursiveTime);
        System.out.println("Recursive took " + precentage + " more time than Non recursive");


    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static int nrfibo(int n) {
        int first = 0;
        int second = 1;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
