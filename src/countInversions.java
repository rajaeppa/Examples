import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class countInversions {

    public static long countInversions(int[] arr){
       long invCount = mergeSort(arr, new int[arr.length], 0, arr.length-1);
      /* for(int i:arr){
    	   System.out.print(i);
       }*/
       return invCount;
    }
  
    private static long mergeSort(int[] arr, int[] tmp,int left, int right){
    	if(left>=right){
    		return 0;
    	}
    	long invCount = 0;
    	int mid = (left+right)/2;
    	invCount = mergeSort(arr, tmp, left, mid);
    	invCount += mergeSort(arr, tmp, mid+1, right);
    	invCount += merge(arr, tmp, left, right);
    	return invCount;
    }
    
    private static long merge(int[] arr, int[] tmp,int leftStart, int rightEnd){
    	
    	int leftEnd = (rightEnd+leftStart)/2 ;
    	int right = leftEnd +1;
    	int size = rightEnd -leftStart +1;
    	int left = leftStart;
    	int index = leftStart;
    	long invCount = 0;
    	while(left <= leftEnd && right <= rightEnd){
    		
    		if(arr[left] <= arr[right]){
    			tmp[index] = arr[left];
    			left++;
    		}else{
    			tmp[index] = arr[right];
    			invCount += right - index;
    			right++;    			
    			
    		}
    		index++;
    	}
    	
    	System.arraycopy(arr, left, tmp, index, leftEnd-left+1);
    	System.arraycopy(arr, right, tmp, index, rightEnd-right+1);
    	System.arraycopy(tmp,leftStart,arr,leftStart,size);
    	
    	return invCount;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
    
    
}
