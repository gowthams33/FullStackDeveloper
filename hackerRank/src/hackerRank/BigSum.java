package hackerRank;

import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  int N = scan.nextInt();
	        int[] Arr = new int[N];
	        for (int i = 0; i < Arr.length; i++) {
				Arr[i] = scan.nextInt();
			}
	        //int sum = 0;
	        String temp = "";
	        int st = 0;
	        int e = 0;
	        for(int i = 0; i<N;i++){
	            temp += Arr[i];
	            st += (int)temp.charAt(temp.length()-1)-48;
	            e += (int)temp.charAt(0)-48;
	        }
	        temp = ""+e+st;
	        String temp1 = ""+e;
	        for(int j=0;j< ( (""+Arr[0]).length() - temp.length());j++)
	            temp1 += "0";
	        temp1 += st;
	        System.out.println(temp1);
	}

}
