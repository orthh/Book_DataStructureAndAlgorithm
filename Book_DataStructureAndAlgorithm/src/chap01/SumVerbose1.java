package chap01;

import java.util.Scanner;

public class SumVerbose1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		do {
			System.out.print("n값 : ");
			n = sc.nextInt();
		} while (n <= 0);
		int sum = 0;
		for(int i=1; i<=n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(n + " = " + sum);
	}

}
