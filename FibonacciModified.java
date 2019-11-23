import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
    private static BigInteger fib(BigInteger t1, BigInteger t2, int n) {
        n = n - 1;
        if (n == 1) {
            return t2;
        }
        return fib(t2, t2.pow(2).add(t1), n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = in.nextBigInteger();
        BigInteger t2 = in.nextBigInteger();
        int n = in.nextInt();
        BigInteger result = fib(t1, t2, n);
        System.out.println(result);
    }
}
