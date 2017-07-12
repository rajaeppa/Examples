package org.examples.ds;
import java.io.*;
import java.util.*;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int[][] array = new int[6][6];
        for(int i=0;i<6;i++){
        	for(int j=0;j<6;j++){
            	array[i][j] = sc.nextInt();
            }
        }
    	int max = Integer.MIN_VALUE;
    	for(int row=0;row<4;row++){
    		for(int col=0;col<4;col++){
    			int ht = array[row][col]+array[row][col+1]+array[row][col+2]+array[row+1][col+1]+array[row+2][col]+array[row+2][col+1]+array[row+2][col+2];
    			if(max<ht){
    				max = ht;
    			}
    		}
    	}
    	System.out.println(max);
    }
}