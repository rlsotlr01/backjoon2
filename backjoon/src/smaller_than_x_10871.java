import java.util.ArrayList;
import java.util.Scanner;

public class smaller_than_x_10871 {
	public static void main(String[] args) {
		System.out.println("?���� ������ ?���� ���� ���� �������ּ���.");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		System.out.printf("%d���� ������ �ϼ������ּ���.\n",n);

		ArrayList<Integer> intArray = new ArrayList<Integer>(10);
		for (int i=0;i<n;i++) {
			intArray.add(scanner.nextInt());
		} // ���� ������.
		// ���� x���� ���� ���� ���.
		for (Integer i : intArray) {
			if (i<x) {
				System.out.print(i+" ");
			}
		}
		
		scanner.close();	
	}
	
}
