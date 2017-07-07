import java.util.Scanner;

public class ConnectedCells {
    public static int getBiggestRegion(int[][] matrix) {
     
    	int maxCount = 0;
    	
    	for(int i=0;i<matrix.length;i++){
    		for(int j=0;j<matrix[i].length;j++){
    			if(matrix[i][j] == 1){
    				int count = getRegionsize(matrix, i ,j);
    				if(count >maxCount){
    					maxCount = count;
    				}
    			}
    			
    		}
    	}
    	
    	return maxCount;
    }
    
    
    private static int getRegionsize(int[][] matrix, int row, int col){
    	if(row <0 || col <0 || row >= matrix.length || col >= matrix[row].length){
    		return 0;
    	}
    	
    	if(matrix[row][col] == 0){
    		return 0;
    	}
    	matrix[row][col] = 0;
    	int size = 1;
    	for( int r=row -1;r<=row+1;r++){
    		for(int c=col-1;c<=col+1;c++){
    			if(r != row || c != col){
    				size+=getRegionsize(matrix, r, c);
    			}
    		}
    	}
    	return size;
    }	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
