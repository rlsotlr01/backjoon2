import java.util.ArrayList;
import java.util.Scanner;


public class kdlskd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		ArrayList<Integer> intArray = new ArrayList<Integer>(10);
		for (int i=0;i<n;i++) {
			intArray.add(scanner.nextInt());
		} // ���� ������.
		// ���� x���� ���� ���� ���.
		for (Integer i : intArray) {
			if (i<x) {
				System.out.println(i);
			}
		}
		
		scanner.close();	
	}
	

}
