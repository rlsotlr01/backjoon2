
import java.util.Scanner;

public class gugudan {
	
	public static void main(String[] args){
		while (true) {
			System.out.println("10 ������ ���ڸ� �Է����ּ���.");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			if (num<=9) {
				for (int i=1; i<=9; i++) {
					int mul = num*i;
					System.out.printf("%d * %d = %d\n",num,i,mul);
				}
				scanner.close();
				break;
			} else {
				scanner.close();
				
				continue;
				
			}	
		
		}
		
		
	}
}