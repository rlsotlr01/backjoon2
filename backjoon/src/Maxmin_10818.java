import java.util.Scanner;

public class Maxmin_10818 {
	public static void main(String[] args) {
		int n;
		int max			= 0;
		int min			= 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� ������ ������ �������ּ���.");
		int numCal 		= scanner.nextInt();
		
		System.out.printf("%d ������ ������ �Է����ּ���.",numCal);
		
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
		System.out.printf("�ִ��� %d�̸�, �ּҰ��� %d�Դϴ�.",max,min);
		scanner.close();
	}
}
