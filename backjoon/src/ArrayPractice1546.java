import java.util.Scanner;

public class ArrayPractice1546 {
	public static void main(String[] args) {
		System.out.println("���� �� ������ ���� N���� �����ּ���.");
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
		} // �ִ� ������.
			
		System.out.println("���۵� ��������� "+ ((sum/max)*100)/(intArr.length) + "�Դϴ�.");	
		scan.close();
	}
}
