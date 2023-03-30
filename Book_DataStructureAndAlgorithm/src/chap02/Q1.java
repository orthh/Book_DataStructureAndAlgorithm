package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		//키와 사람수 랜덤으로 
		//키 : 100+ 90랜덤
		
		Scanner sc = new Scanner(System.in);
		//키의 최대값을 구합니다.
		System.out.println("키의 최대값을 구합니다.");
		//사람수 : 인풋
		//System.out.print("사람수 : " );
		int num = rd.nextInt(10) + 1;
		//Array선언 및 초기화
		int[] numArr = new int[num];
		//height[0] : 입력
		//사람수만큼 반복
		for(int i=0; i<num; i++) {
			numArr[i] = 100 + rd.nextInt(90);
			System.out.println("height[" + i + "] : " + numArr[i]);

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
