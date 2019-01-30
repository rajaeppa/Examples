package org.examples.codechef;

import java.util.Scanner;

public class LECANDY {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0;i<t;i++) {
			int n = scanner.nextInt();
			long c = scanner.nextInt();
			int[] elephants = new int[n];
			long total = 0;
			for(int j=0;j<n;j++) {
				elephants[j] = scanner.nextInt();
				total+=elephants[j];
			}
			System.out.println((c >= total?"Yes":"No"));
		}
	}

}
