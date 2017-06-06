package hackerRank;

import java.util.Scanner;

public class Algorithmic {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		int k[] = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			k[i] = scanner.nextInt();
		}
		
		for(int i = 0;i < M;i++){
			if(a[i]>=1 && a[i]<=N && b[i]>=1 && b[i]<=N)
				System.out.println();
		}
				
	}

}
