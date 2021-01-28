import java.util.Scanner;

public class MeanNotice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		double sum = 0;
		int count = 0;
		double percentage = 0;
		
		for(int i=0;i<c;i++) {
			int numstudent=scanner.nextInt();
			int[] score = new int[numstudent];
			for (int j=0; j<numstudent; j++) {
				score[j] = scanner.nextInt();
				sum = sum + score[j];
			}
			double mean = sum/numstudent;
			for (int j=0; j<numstudent; j++) {
				if (score[j]>mean) {
					count++;
				}
				
			}
			percentage = count/(score.length);
		}
		
		System.out.println(percentage*100+"%");
		scanner.close();
	}

}
