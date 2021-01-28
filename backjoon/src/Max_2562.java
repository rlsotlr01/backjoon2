import java.util.Scanner;

public class Max_2562 {
	public static void main(String[] args) {
		int numCal = 9;
		int max=0;
		int num;
		int count=0;
		int loc=0;
		
		System.out.println("최댓값을 찾고,\n 그 최댓값이 몇 번째 수인지 알아낸다.");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<numCal;i++) {
			num = scanner.nextInt();
			count+=1;
			if (i==0) {
				max = num;
			}else {
				if (max<num) {
					max=num;
					loc = count;
				}
			}
		}
		System.out.printf("최댓값은 %d이며, %d번째 자리에 위치합니다.",max,loc);
		scanner.close();
	}
}
