import java.util.Scanner;

public class Array_Mean_1546 {
	public static void main(String[] args) {
		int count 	= 0;
		double sum	= 0;
		System.out.println("시험 본 과목 갯수: ");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = scanner.nextInt();
			if (n>1000) {
				System.out.println("n 범위 초과, 프로그램 종료");
				break;
			}
			System.out.println("각 과목 점수 입력: ");
			while ((scanner.nextInt()!=0)) {
				int i = scanner.nextInt();
				sum += i;
				count++;	
			}
			
			}
		scanner.close();
		}
	}

