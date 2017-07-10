import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SetEqualUsingLCMGCD {

    static int getTotalX(int[] a, int[] b){
        // Complete this function
    	
    	List<Integer> aList = convertintToInteger(a);
    	Collections.sort(aList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
    	
    	List<Integer> bList = convertintToInteger(b);
    	Collections.sort(bList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
    	Integer acf = lcm(aList);
    	Integer bcf = bList.size()>1?gcd(bList):bList.get(0);
    	
    	int count = 0;
    	for(int i=acf,j=acf;i<=bcf;i=i+j){
    		if(((i%j) == 0) && (bcf%i == 0)){
    			count++;
    		}
    	}
    	return count;
    }
    private static List<Integer> convertintToInteger(int ints[]){
    	List<Integer> intList = new ArrayList<Integer>();
    	for (int index = 0; index < ints.length; index++)
    	{
    	    intList.add(ints[index]);
    	}
    	
    	return intList;
    }
  private static int gcd(List<Integer> intArray){
    	
    	int result = intArray.get(0);
    	for(int i =1;i<intArray.size();i++){
    		result = gcd(result,intArray.get(i));
    	}
    	return result;
    }
    private static int lcm(List<Integer> intArray){
    	int result = intArray.get(0);
    	for(int i =1;i<intArray.size();i++){
    		result = (result*intArray.get(i))/gcd(result,intArray.get(i));
    	}
    	return result;
    }
    private static int gcd(int a, int b){
    	
    	while(b!=0){
    		int tmp = b;
    		b = a%b;
    		a = tmp;
    	}
    	return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
