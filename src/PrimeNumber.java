import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
        	BigInteger bi = in.nextBigInteger();
            if(bi.isProbablePrime(100)){
            	System.out.println("Prime");
            }else{
            	System.out.println("Not prime");
            }
        }
    }
    
}
