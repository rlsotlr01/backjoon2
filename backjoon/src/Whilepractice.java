import java.util.Scanner;

public class Whilepractice {
	public static void main(String[] args) {
		System.out.println("A와 B 값을 입력해주세요. A는 0보다 크고, B는 10보다 작아야 합니다.");
		Scanner scanner = new Scanner(System.in);
		// Scanner(System.in) 은 이 장치를 그냥 가져온거.
		// 인풋을 받아들이는 건 scanner.nextInt() 이다.
		while (scanner.hasNextInt()) {
			int A=scanner.nextInt();
			int B=scanner.nextInt();
			
			if ((A<=0)||(B>=10)) {
				System.out.println("A는 0보다 커야 하며, B는 10보다 작아야 합니다. 프로그램이 다시 실행됩니다.");
				continue;
			}
			System.out.println(A+B);
//			Q. scanner.close(); - 왜 scanner.close() 쓰면 루프 한번 돌아가고 에러 뜨는거지?
			// while 루프 안에 scanner.close 를 하게 되면 장치를 빌리는 코딩이 while 바깥에 있기에 오류뜸.
		}
		scanner.close();
	}
}
