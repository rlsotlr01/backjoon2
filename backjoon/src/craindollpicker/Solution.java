package craindollpicker;

import java.util.ArrayList;

class Solution{
	
//	도훈이형 이거쫌 뜯어고쳐주세요. 제가 하기 싫어요.
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> basket = new ArrayList<>();
//  moves ���� ���ڴ� j������ (��)
//  ���� ù��° ���� 3�̴� -> 3���� ù��°�� ������ ��(0�� �ƴ� ��)�� ������ �ٱ���.
//  �׸��� �� 3���� ù��°�� �ش��ϴ� ���� board ���� 0���� �ٲ���� ��.
//  ���࿡ move�� ���� �� ������ ���� �� answer += 2 �ϰ�,
//  �� �ΰ� ���� 0���� �ٲ���� ��.
//  
		
		for(int i=0; i<moves.length; i++) {
			// moves ��Ŀ� �ִ� ������ �ϳ��ϳ� basket �� ��´�.
			int k = moves[i]-1;
			for(int j=0; j<board.length; j++) {
				if(board[j][k] != 0) {
					basket.add(board[j][k]); // �̰�,
					board[j][k] = 0; // �� �� ���� ������ ���ְ�,
					break;
				}
			}
		}
		

		
		
		while(true) {
//			����&ť �����ϱ�.
			int answercurrent = answer;
			for(int i=1; i<basket.size(); i++) {
				if((basket.get(i)==basket.get(i-1))&&basket.get(i)!=0) {
					answer+=2;
					basket.remove(i);
					basket.remove(i-1);
					break;
					
				}
			}
			if(answercurrent == answer) {
				break;
			}
		}
		// �̰� ����� �ٸ��� �ؾ� �� ��. 		
		return answer;
	}
	
}

