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
		} // 숫자 더했음.
		// 이제 x보다 작은 값들 출력.
		for (Integer i : intArray) {
			if (i<x) {
				System.out.println(i);
			}
		}
		
		scanner.close();	
	}
	

}
