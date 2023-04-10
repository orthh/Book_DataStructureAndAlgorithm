package chap02;

public class PhysicalExamination {
	
	static final int VMAX = 21; //시력 분포(0.0~0.1단위로 21개)
	
	
	// 키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		}
		
		return sum/dat.length;
		
	}
	
	// 시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i= 0 ;
		
		dist[i] = 0;
		for(i = 0; i < dat.length; i++){
			if(dat[i].vision >= 0.0 && dat[i].vision <=VMAX / 10.0) {
				dist[(int)(dat[i].vision * 10 )]++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		PhyscData[] x = {
			new PhyscData("강민하", 162, 0.3),
			new PhyscData("김찬우", 173, 0.7)	,		
			new PhyscData("박준서", 175, 2.0)	,		
			new PhyscData("유서범", 171, 1.5)	,		
			new PhyscData("이수연", 168, 0.4)	,		
			new PhyscData("정경오", 174, 1.2)	,		
			new PhyscData("황지안", 169, 0.8)			
		};
		
		int[] vidst = new int[VMAX];
		
		
		
		
		
	}

}
