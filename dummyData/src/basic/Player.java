package basic;

import java.util.ArrayList;

public class Player { // 플레이어 클래스

	ArrayList<Card> card = new ArrayList<Card>();
	// Card 타입의 ArrayList 객체 생성
	
	public void getCard(Card card) {
		this.card.add(card);
	}

	public void showCards() {
		System.out.println(card);
	}
	
}
