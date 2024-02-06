package basic;

public class Card { // 카드 저장 클래스
	
	String suit;
	String number;

	public Card(String suit, String number) { // 생성자
		this.suit = suit;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "(" + suit + " " + number + ")";
	}
	
}
