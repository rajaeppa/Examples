import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class AppleAndOrange {
	
	
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int t = in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    int m = in.nextInt();
    int n = in.nextInt();
    int[] apple = new int[m];
    for(int apple_i=0; apple_i < m; apple_i++){
        apple[apple_i] = a+in.nextInt();
    }
    int[] orange = new int[n];
    for(int orange_i=0; orange_i < n; orange_i++){
        orange[orange_i] = b+in.nextInt();
    }
    
    int af = 0;        
        for(int i = 0;i<apple.length;i++){
            if(s<=apple[i] && apple[i]<=t){
                af++;
            }
        }
       System.out.println(af);
    int of = 0;
        for(int i = 0;i<orange.length;i++){
            if(s<=orange[i] && orange[i]<=t){
                of++;
            }
        }

        System.out.println(of);
}
	
}
