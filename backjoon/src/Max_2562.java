import java.util.Scanner;

public class Max_2562 {
	public static void main(String[] args) {
		int numCal = 9;
		int max=0;
		int num;
		int count=0;
		int loc=0;
		
		System.out.println("�ִ��� ã��,\n �� �ִ��� �� ��° ������ �˾Ƴ���.");
		
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
		System.out.printf("�ִ��� %d�̸�, %d��° �ڸ��� ��ġ�մϴ�.",max,loc);
		scanner.close();
	}
}
