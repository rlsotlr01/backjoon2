import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		int[] coins = {10,50,100,500};
		System.out.println("거스름돈이 얼마입니까? \"0을 기입하면 프로그램이 종료됩니다.\"");
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
			System.out.println("입력하신 값이 유효하지 않습니다. 프로그램이 종료됩니다.");
			return;
		}
		numfiv = change/500;
		numhun = (change%500)/100;
		numfif = ((change%500)%100)/50;
		numten = (((change%500)%100)%50)/10;
		count++;

		
		
		System.out.println("거스름돈 : "+ change);
		System.out.println("500원 : "+numfiv);
		System.out.println("100원 : "+numhun);
		System.out.println("50원 : "+numfif);
		System.out.println("10원 : "+numten);
		
		scan.close();
		
	}

}
