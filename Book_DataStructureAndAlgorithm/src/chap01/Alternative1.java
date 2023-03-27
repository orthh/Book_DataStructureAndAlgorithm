package chap01;

import java.util.Scanner;

public class Alternative1 {

	public static void main(String[] args) {
		// +와 -를 번갈아 출력
		
		int n = 12;
		
		//두가지 문제
		//1. 반복할때마다 if문 실행해야함
		//2. 변경할때 유연하게 대응하기 어려움
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
	}

}
