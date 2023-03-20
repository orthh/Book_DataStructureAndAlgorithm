package chap01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = getTwiceSystemInput();
		System.out.println("b-a의 값은 " + (inputArr[1] - inputArr[0]) + "입니다.");
		
	}
	static int[] getTwiceSystemInput() {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[2];
		do {
			System.out.print("a값 : ");
			numArr[0] = sc.nextInt();
			System.out.print("b값 : ");
			numArr[1] = sc.nextInt();
			if(numArr[0]>=numArr[1]) {
				System.out.println("a보다 큰값을 입력하세요.");
			}
		} while (numArr[0]>=numArr[1]);
		return numArr;
	}

}
