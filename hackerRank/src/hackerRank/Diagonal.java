package hackerRank;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[][] arr = new int[N][N];
		int sum = 1;
		int temp = 0;
		int temp1 = 0;
		for (int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++){
				arr[i][j] = scanner.nextInt();
				if(!(arr[i][j]>= -100 && arr[i][j]<= 100))
					sum = 0;
			}
		}
		if(sum == 0)
			System.out.println(sum);
		else{
			for(int i = 0; i < N; i++)
				temp += arr[i][i];
			for(int j = 0; j < N; j++)
				temp1 += arr[j][N-j-1];
			sum = Math.abs(temp - temp1);
			System.out.println(sum);
		}
		scanner.close();
	}

}
