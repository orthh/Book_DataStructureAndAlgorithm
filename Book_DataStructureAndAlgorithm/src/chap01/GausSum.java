package chap01;

public class GausSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumGaus(3));
		System.out.println(sumBetween(3,5));
		System.out.println(sumBetween(6,4));
	}
	static int sumGaus(int n) {
		return (1+n) * n/2;
		
	}
	static int sumBetween(int x, int y) {
		int sum = 0;
		if(x > y) {
			for(int i=y; i<=x; i++) {
				sum += i;
			}
		}else {
			for(int i=x; i<=y; i++) {
				sum += i;
			}
		}
		
		return sum;
	}
}
