package org.example.alg.array;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DynamicArray {

	static Integer lastAnswer = 0;
    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    	List<Integer> result = new ArrayList<Integer>();
    	List<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
    	for(int i=0;i<n;i++) {
    		sequences.add(i,new ArrayList<Integer>());
    	}
    	int index = -1;
    	for(List<Integer> list: queries) {
    		if(list.get(0) == 1) {
    			index = (list.get(1)^lastAnswer)%n;
    			sequences.get(index).add(list.get(2));
    		}else if(list.get(0) == 2) {
    			index = (list.get(1)^lastAnswer)%n;
    			lastAnswer = sequences.get(index).get(list.get(2)%sequences.get(index).size());
    			result.add(lastAnswer);
    		}
    	}
    	
    	return result;
    	
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
