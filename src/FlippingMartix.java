import java.io.*;
import java.util.*;

public class FlippingMartix {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int q = sn.nextInt();
        int n = sn.nextInt();
        int r = 2*n;
        int c = 2*n;
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
        	for(int j=0;j<c;j++){
        		matrix[i][j] = sn.nextInt();
        	}
        }
        
       
    }
}