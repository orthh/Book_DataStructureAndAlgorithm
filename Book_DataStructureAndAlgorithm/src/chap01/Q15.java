package chap01;

public class Q15 {

	public static void main(String[] args) {
		spira(10);

	}
	
	static void spira(int n) {
		for(int i = 1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2 + 1; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
