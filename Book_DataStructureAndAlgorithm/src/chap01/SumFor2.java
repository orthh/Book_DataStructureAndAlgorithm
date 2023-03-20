package chap01;

import java.util.Scanner;

public class SumFor2 {

	public static void main(String[] args) {
		
		//1부터 -5까지의 출력값은 0입니다가 뜸.
		//정확한 표현이 아님.
		//1부터 -5까지의 출력값 정상출력하기
		
		int n = getOneValueOfScanner();
		/*do {
			System.out.print("n값 : ");
			n = sc.nextInt();
		}while(n<=0);
		*/
		System.out.println(sumPlusMinus(n));
	}
	static int sumPlusMinus(int n) {
		int sum = 0;
		if(n<=0) {
			for(int i=n; i<=1; i++) {
				sum += i;
			}
		}else {
			for(int i=1; i<=n; i++) {
				sum += i;
			}
		}
		
		return sum;
	}
	static int getOneValueOfScanner() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합계를 구합니다.");
		
		System.out.print("n값 : ");
		n = sc.nextInt();
		return n;
	}
	

}
