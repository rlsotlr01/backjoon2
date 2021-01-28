import java.util.Scanner;

public class ArrayPractice1546 {
	public static void main(String[] args) {
		System.out.println("시험 본 과목의 개수 N개를 적어주세요.");
		Scanner scan = new Scanner(System.in);
		double sum 		= 0;
		int[] intArr 	= new int[scan.nextInt()];
		int max 		= 0;
		
		
		for(int i=0; i<intArr.length;i++) {
			intArr[i]=scan.nextInt();
			sum+=intArr[i];
		}
		for(int i=0; i<intArr.length;i++) {
			if (i==0) {
				max = intArr[i];
			}else {
				if (max<intArr[i]) {
					max = intArr[i];
				}
			}
		} // 최댓값 구해줌.
			
		System.out.println("조작된 평균점수는 "+ ((sum/max)*100)/(intArr.length) + "입니다.");	
		scan.close();
	}
}
