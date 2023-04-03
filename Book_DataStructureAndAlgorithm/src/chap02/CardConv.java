package chap02;

import java.util.Scanner;

public class CardConv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; // 다시 한번 ?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

		System.out.print("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			} while (no < 0);

			do {
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno);
			System.out.println(dno);
			System.out.println(cno);
			
			//Q6
			System.out.printf("%3d|\t%3d" ,cd, no);
			System.out.println("\n   +----------");
			for(int i=0; i<dno; i++) {
				no = no/2;
				if(i == dno -1) {
					System.out.printf("    \t%3d ...%3c", no, cno[dno - 1 -i]);
					System.out.println();
				}else {
					System.out.printf("%3d|\t%3d ...%3c", cd,no, cno[dno - 1 -i]);
					System.out.println();
				}
				
			}

			System.out.println(cd + "진수로");
			for (int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.print("입니다.");

			System.out.print("한번 더 할까요 ? (1...예 / 0...아니요): ");
			retry = sc.nextInt();
		} while (retry == 1);
	}

	static int cardConv(int x, int r, char[] d) { // 정숫값 x를 r진수로 변환하여 배열d에 아랫자리부터 넣어 두고 자릿수를 반환
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}

		return digits;

	}

}
