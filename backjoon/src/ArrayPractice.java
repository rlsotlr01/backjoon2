import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		
		System.out.println("1000���� �۰�, ���� �ƴ� ������ 10�� �־��ּ���.");

		for(int i=0;i<10;i++) {
			if (((n=scan.nextInt())<0)||(n>=1000)) {
				System.out.println("1000���� �۰� ���� �ƴ� ������ �־�� �մϴ�.");
				break;
			}
			if (!(intArr.contains(n%42))){
				intArr.add(n%42);				
			}
		}
		System.out.println(intArr.size());
		scan.close();
	}

}
