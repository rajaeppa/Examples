import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>(5);
        for(int arr_i=0; arr_i < 5; arr_i++){
            	list.add(in.nextLong());
        }
        Collections.sort(list);
        Long min = list.get(0) +list.get(1) +list.get(2) +list.get(3);
        Long max = list.get(1) +list.get(2) +list.get(3) +list.get(4);
        System.out.println(min+" "+max);
    }
}
