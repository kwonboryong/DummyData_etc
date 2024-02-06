package basic;

import java.util.ArrayList;
import java.util.Collections;

public class Random {
	
	ArrayList<Card> random = new ArrayList<Card>();

	String[] suit = {"CLUB", "DIAMOND", "HEART", "SPACE"};
	String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "2", "10", "J", "Q", "K", "A"};

	public Random() {
		for (int i = 0; i < suit.length; i++) { // 카드 모양
			for (int j = 0; j < number.length; j++) { // 카드 숫자
				random.add(new Card(suit[i], number[j]));
			}
		}
	}	

	public void suffle() { 
		Collections.shuffle(random);
		// ArrayList<Card>에 있는 값들이 랜덤으로 출력
	}
	
	public Card deal() {
		return random.remove(0);
		// remove(): 해당 인덱스를 삭제, 반환
		// Card 객체에서 첫 번째 요소를 삭제 후 반환
	}
	
}
