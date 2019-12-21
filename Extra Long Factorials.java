import java.math.BigInteger;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BigInteger i = new BigInteger("1");
        BigInteger n = in.nextBigInteger();
        BigInteger fact = new BigInteger("1");
        for (;i.compareTo(n) == -1 || i.compareTo(n) == 0;i=i.add(BigInteger.ONE)){
            fact  =  fact.multiply(i);
        }
        System.out.println(fact);
    }
}
