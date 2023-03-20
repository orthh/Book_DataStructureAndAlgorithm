package chap01;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		System.out.print("값 : ");
		int n = sc.nextInt();
		
		System.out.println(sum(n));
	}
	public static int sum(int x) {
		int sum = 0;
		int cnt =1;
		while(cnt<=x) {
			sum += cnt;
			cnt++;
		}
		return sum;
	}

}
