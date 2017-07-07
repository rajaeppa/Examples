import java.util.HashMap;
import java.util.Scanner;

public class StairCaseRecursion {
	
	private final static HashMap<Integer,Integer> cacheMap = new HashMap<>();

    public static void main(String[] args) {
    	  cacheMap.put(1, 1);
          cacheMap.put(2, 2);
          cacheMap.put(3, 4);
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(recursion(n));
        }
      
    }
    private static int recursion(int n){

    	if(cacheMap.containsKey(n)){
    		return cacheMap.get(n);
    	}else if(n >3){
    		int n1 = recursion(n-1) + recursion(n-2) + recursion(n-3);
    		cacheMap.put(n, n1);
    		return n1;
    	}
    		
    	return 0;
    }
}
