package basic;

public class Game {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		rnd.suffle();
		// Random의 suffle() 실행: 랜덤 출력
		
		Player p1 = new Player(); // 플레이어 객체 생성
		Player p2 = new Player();
		
		p1.getCard(rnd.deal());
		p2.getCard(rnd.deal());
		// Random의 deal() 실행: 첫 번째 카드 가져옴 -> Player의 getCard() 실행: 가져온 카드 저장 
		
		p1.showCards();
		p2.showCards();
		// Player의 showCards() 실행: ArrayList<Card>에 저장된 카드를 출력
		
	}
}
