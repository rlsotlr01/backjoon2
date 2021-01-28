
public class ArrPrac {

	public static void main(String[] args) {
		int[] intArr = {10,20,30,50,3,60,-3};
		int count = 0;
		for(int i : intArr) {
			if (i==60) {
				System.out.println(count);
			}
			count++;
		}
	}

}
