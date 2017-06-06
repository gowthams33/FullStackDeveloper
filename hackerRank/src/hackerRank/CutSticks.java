package hackerRank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CutSticks {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int[] arr = new int[N];
		int count = 0;
		int cut = 0;
		int small = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			
		}
		
		Set<Integer> set = new TreeSet<>();
		Arrays.sort(arr);
		small = arr[0];
		System.out.println(small); 
		
		
		set.add(arr.length);
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			
			for (int j = 0; j < arr.length; j++) {
				cut = arr[j] - small;
				if(cut>0)
					count++;
				arr[j] = cut;
			}
			
			
			System.out.println(count+"  "+small); 
			
			if(count != 0){
				set.add(count);
				small = arr[arr.length - count];
			}
			
			if(count == 1)
				break;
		}
		TreeSet<Integer> tset = (TreeSet<Integer>) ((TreeSet<Integer>) set).descendingSet();
		for (Integer integer : tset) {
			System.out.println(integer);
		}
		scanner.close();
	}

}
