package chap02;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// 소수 : 자신과 1 이외에 어떤 수로도 나누어 떨어지지 않는 정수.
		int cnt = 0;
		for(int n=2; n<=1000; n++) { //2부터 1000까지 반복
			int i; //i 변수 바깥으로 뺌.
			for(i=2; i<n; i++) { //2부터 n미만까지 for문
				cnt++;           //나눗셈횟수 증가
				if( n% i == 0 ) { //n이 i로 나누어 떨어지면 내부for문 종료
					break;
				}
			}
			if(n == i) {   //자기 자신까지 for문 돌았으면 소수
				System.out.println(n); //소수 출력
			}
			
			
		}
		System.out.println("나눗셈을 수행한 횟수 : " + cnt);
		
	}

}
