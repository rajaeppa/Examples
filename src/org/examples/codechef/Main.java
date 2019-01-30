	package org.examples.codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int x=0;x<t;x++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			String[] fl = new String[n];
			for(int i=0;i<n;i++) {
				fl[i] = scanner.next();
			}		
			
			ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<k;i++) {
            		int s = scanner.nextInt();
            		for(int z=0;z<s;z++) {
            			list.addAll(Arrays.asList(scanner.next().split(" ")));
            		}
            } 			
			for(String str:fl) {
				if (list.contains(str)) {
					System.out.print("YES ");
				}else {
					System.out.print("NO ");
				}
			}
            
		}
	}

}


