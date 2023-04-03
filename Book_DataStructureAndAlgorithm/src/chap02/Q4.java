package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
	
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length - 1 - i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i < x.length; i++) {
			System.out.print("x[" + i + "]: " );
			x[i] = sc.nextInt();
		}
		
		int[] copiedX = new int[x.length];
		
		copy(copiedX,x);
		
		System.out.println("x = " + Arrays.toString(copiedX));
		rcopy(x, copiedX);
		System.out.println("x = " + Arrays.toString(x));
	}

}
