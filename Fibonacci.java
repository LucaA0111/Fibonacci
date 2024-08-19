import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    static ArrayList<BigInteger> sequence;

    //Used BigInteger to avoid overflow
    public static ArrayList<BigInteger> fibonacci(int lunghezza) {

        sequence = new ArrayList<>();
        if (lunghezza <= 0) {
            return null;

        } else if (lunghezza==1) {
            sequence.add(0, BigInteger.ZERO);
            System.out.println(sequence);
            return sequence;

        }else {

            sequence.add(0, BigInteger.ZERO);
            sequence.add(1, BigInteger.ONE);

            for (int i = 2; i < lunghezza; i++) {
                BigInteger x = sequence.get(i - 2);
                BigInteger y = sequence.get(i - 1);
                BigInteger sum = x.add(y);
                sequence.add(i, sum);
                System.out.println(sequence);
            }
        }

        return sequence;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire la lunghezza dela successione: ");
        fibonacci(sc.nextInt());


    }
}

