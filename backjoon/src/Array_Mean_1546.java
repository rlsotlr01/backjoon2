import java.util.Scanner;

public class Array_Mean_1546 {
	public static void main(String[] args) {
		int count 	= 0;
		double sum	= 0;
		System.out.println("���� �� ���� ����: ");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = scanner.nextInt();
			if (n>1000) {
				System.out.println("n ���� �ʰ�, ���α׷� ����");
				break;
			}
			System.out.println("�� ���� ���� �Է�: ");
			while ((scanner.nextInt()!=0)) {
				int i = scanner.nextInt();
				sum += i;
				count++;	
			}
			
			}
		scanner.close();
		}
	}

