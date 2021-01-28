import java.util.ArrayList;
import java.util.Scanner;

public class smaller_than_x_10871 {
	public static void main(String[] args) {
		System.out.println("?개의 수열에 ?보다 작은 값을 추출해주세요.");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		System.out.printf("%d개의 수열을 완성시켜주세요.\n",n);

		ArrayList<Integer> intArray = new ArrayList<Integer>(10);
		for (int i=0;i<n;i++) {
			intArray.add(scanner.nextInt());
		} // 숫자 더했음.
		// 이제 x보다 작은 값들 출력.
		for (Integer i : intArray) {
			if (i<x) {
				System.out.print(i+" ");
			}
		}
		
		scanner.close();	
	}
	
}
