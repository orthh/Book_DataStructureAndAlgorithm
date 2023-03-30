package chap02;

import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키의 최대값을 구합니다.
		System.out.println("키의 최대값을 구합니다.");
		//사람수 : 인풋
		System.out.print("사람수 : " );
		int num = sc.nextInt();
		//Array선언 및 초기화
		int[] numArr = new int[num];
		//height[0] : 입력
		//사람수만큼 반복
		for(int i=0; i<num; i++) {
			System.out.print("height[" + i + "] : ");
			numArr[i] = sc.nextInt();
		}
		//maxOf함수 돌림.
		int maxHeight = maxOf(numArr);
		//최대값은 192입니다.
		System.out.println("최대값은" + maxHeight);
	}
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(max < a[i]) max = a[i];
		}
		return max;
	}

}
