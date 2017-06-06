package hackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Plus {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		int N = scanner.nextInt();
		int[] arr = new int[N];
		int first = 0;
		int sec = 0;
		int thr = 0;
		double re = 0.0;
		
		String formate = "";
		String temp = "0.";
		
		for(int i = 0;i< N;i++)
			temp+="0";
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] == 0)
				thr ++;
			else if(arr[i]>0)
				sec++;
			else
				first++;
		}
		DecimalFormat df=new DecimalFormat(temp);
	 
		re = (double)sec/N;
		formate = df.format(re);
		System.out.println(formate);
		re = (double)first/N;
		formate = df.format(re);
		System.out.println(formate);
		re = (double)thr/N;
		formate = df.format(re);
		System.out.println(formate);
	}

}
