import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		int[] coins = {10,50,100,500};
		System.out.println("�Ž������� ���Դϱ�? \"0�� �����ϸ� ���α׷��� ����˴ϴ�.\"");
		Scanner scan = new Scanner(System.in);
		int change=0;
		int numten=0;
		int numfif=0;
		int numhun=0;
		int numfiv=0;
		int count=0;
		int n;
		
		
		change = scan.nextInt();
		if (change <0) {
			System.out.println("�Է��Ͻ� ���� ��ȿ���� �ʽ��ϴ�. ���α׷��� ����˴ϴ�.");
			return;
		}
		numfiv = change/500;
		numhun = (change%500)/100;
		numfif = ((change%500)%100)/50;
		numten = (((change%500)%100)%50)/10;
		count++;

		
		
		System.out.println("�Ž����� : "+ change);
		System.out.println("500�� : "+numfiv);
		System.out.println("100�� : "+numhun);
		System.out.println("50�� : "+numfif);
		System.out.println("10�� : "+numten);
		
		scan.close();
		
	}

}
