package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int item : a) {
			sum += item;
		}
		
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i < x.length; i++) {
			System.out.print("x[" + i + "]: " );
			x[i] = sc.nextInt();
		}
		
		System.out.println("요소의 합 : ");
		System.out.println("x = " + Arrays.toString(x));
		System.out.println(sumOf(x));

	}

}
