import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int nos = 0;
        for(int i=0;i<n;i++){
        	for(int j=0;j<n-1;j++){
        		if(a[j] > a[j+1]){
        			swap(a, j, j+1);
        			nos++;
        		}
        	}
        	if(nos == 0){
        		break;
        	}
        }
        
        System.out.println("Array is sorted in "+nos+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        
    }
    
    private static void swap(int a[],int i, int j){
    	int t = a[j];
    	a[j] = a[i];
    	a[i] = t;
    }
}
