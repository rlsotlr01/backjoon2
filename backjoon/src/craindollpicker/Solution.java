package craindollpicker;

import java.util.ArrayList;

class Solution{
	
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> basket = new ArrayList<>();
//  moves 안의 숫자는 j값으로 (열)
//  만약 첫번째 값이 3이다 -> 3열에 첫번째로 나오는 값(0이 아닌 값)을 꺼내서 바구니.
//  그리고 그 3열에 첫번째에 해당하는 값을 board 에서 0으로 바꿔줘야 함.
//  만약에 move의 값과 그 전값이 같을 땐 answer += 2 하고,
//  그 두개 값을 0으로 바꿔줘야 함.
//  
		
		for(int i=0; i<moves.length; i++) {
			// moves 행렬에 있는 값들을 하나하나 basket 에 담는다.
			int k = moves[i]-1;
			for(int j=0; j<board.length; j++) {
				if(board[j][k] != 0) {
					basket.add(board[j][k]); // 뽑고,
					board[j][k] = 0; // 그 값 없는 값으로 해주고,
					break;
				}
			}
		}
		
		
		
		
		while(true) {
//			스택&큐 공부하기.
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
		// 이거 방식을 다르게 해야 될 듯. 		
		return answer;
	}
	
}

