import java.util.Scanner;

public class Whilepractice {
	public static void main(String[] args) {
		System.out.println("A�� B ���� �Է����ּ���. A�� 0���� ũ��, B�� 10���� �۾ƾ� �մϴ�.");
		Scanner scanner = new Scanner(System.in);
		// Scanner(System.in) �� �� ��ġ�� �׳� �����°�.
		// ��ǲ�� �޾Ƶ��̴� �� scanner.nextInt() �̴�.
		while (scanner.hasNextInt()) {
			int A=scanner.nextInt();
			int B=scanner.nextInt();
			
			if ((A<=0)||(B>=10)) {
				System.out.println("A�� 0���� Ŀ�� �ϸ�, B�� 10���� �۾ƾ� �մϴ�. ���α׷��� �ٽ� ����˴ϴ�.");
				continue;
			}
			System.out.println(A+B);
//			Q. scanner.close(); - �� scanner.close() ���� ���� �ѹ� ���ư��� ���� �ߴ°���?
			// while ���� �ȿ� scanner.close �� �ϰ� �Ǹ� ��ġ�� ������ �ڵ��� while �ٱ��� �ֱ⿡ ������.
		}
		scanner.close();
	}
}
