import java.util.Scanner;

public class Maxmin_10818 {
	public static void main(String[] args) {
		int n;
		int max			= 0;
		int min			= 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("비교할 정수의 갯수를 선정해주세요.");
		int numCal 		= scanner.nextInt();
		
		System.out.printf("%d 갯수의 정수를 입력해주세요.",numCal);
		
		for(int i=0;i<numCal;i++) {
			if (i==0) {
				max=scanner.nextInt();
				min = max;
			}else {
				if ((n=scanner.nextInt())<min) {
					min = n;
				}else if(n>max) {
					max = n;
				}
			}	
		}
		System.out.printf("최댓값은 %d이며, 최소값은 %d입니다.",max,min);
		scanner.close();
	}
}
