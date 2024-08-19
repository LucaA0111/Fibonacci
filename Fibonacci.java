import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    //Used BigInteger to avoid overflow
    public static ArrayList<BigInteger> fibonacci(int lunghezza) {
        ArrayList<BigInteger> succesione = new ArrayList<>();
        succesione.add(0, BigInteger.ZERO);
        succesione.add(1, BigInteger.ONE);

        for(int i =2; i < lunghezza; i++){
            BigInteger x = succesione.get(i-2);
            BigInteger y =  succesione.get(i-1);
            BigInteger sum = x.add(y);
            succesione.add(i, sum);
            System.out.println(succesione);
        }

        return succesione;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire la lunghezza dela successione: ");
        fibonacci(sc.nextInt());


    }
}

