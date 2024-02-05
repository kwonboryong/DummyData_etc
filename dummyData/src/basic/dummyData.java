package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dummyData {

	public static void main(String[] args) { // 출력
		for (int i = 0; i < 30; i++) {
			System.err.println(name() + "," + id() + no1() + "," + pw() + no3() + "," + birDate() + ran() + no4() + ","
					+ phone() + "-" + no2() + "-" + no2() + "," + "없음");
		}
	}

	public static String name() { // 이름
		List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황",
				"안", "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성",
				"차", "주", "우", "구", "신", "임", "나", "전", "민", "유", "진", "강", "현", "신");
		List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "다",
				"단", "담", "대", "덕", "도", "동", "만", "명", "무", "문", "미", "민", "바", "박", "백", "범", "별", "병", "보", "빛", "사",
				"산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순", "숭", "슬", "승", "시", "신", "아",
				"안", "여", "연", "영", "예", "오", "완", "용", "우", "원", "유", "윤", "율", "은", "의", "이", "익", "인", "일", "장", "재",
				"전", "정", "제", "조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "충", "태", "택", "판", "하", "한",
				"해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "황", "린", "을",
				"비", "솜", "공", "면", "탁", "온", "균", "묵", "송", "욱", "휴", "언", "령", "열", "웅", "분", "변", "양", "출", "흥", "겸",
				"곤", "번", "식", "란", "반", "빈", "실", "람", "헌", "엽", "학", "개", "평", "늘");
		Collections.shuffle(성);
		// Java로 리스트를 섞는 가장 쉬운 방법: 내장 객체인 Collections 객체의 셔플(Shuffle) 사용 (배열을 랜덤으로 재정렬)
		Collections.shuffle(이름);

		return 성.get(0) + 이름.get(0) + 이름.get(1);
	}

	public static String id() { // 아이디
		String text = "";
		String ran = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 6; i++) {
			text += ran.charAt((int) (Math.random() * ran.length()));
		}
		return text;
	}

	public static String no1() { // 아이디
		return (int) (Math.random() * 99) + 1 + "";
	}

	public static String pw() { // 비밀번호
		String text = "";
		String ran = "0123456789";
		for (int i = 0; i < 2; i++) {
			text += ran.charAt((int) (Math.random() * ran.length()));
		}
		return text;
	}

	public static String no3() { // 비밀번호
		return (int) (Math.random() * 99) + 1 + "";
	}

	public static String phone() { // 전화번호
		List<String> 번호 = Arrays.asList("010");
		Collections.shuffle(번호);

		return 번호.get(0);
	}

	public static String no2() { // 전화번호
		return (int) (Math.random() * 8999) + 1000 + "";
	}

	// 주민번호
	public static List<String> 도 = Arrays.asList("00", "01", "02", "03");
	public static List<String> 년도 = Arrays.asList("19", "20");
	public static List<String> 월 = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
			"12");
	public static List<String> 일 = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
			"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30");

	public static String birDate() {
		Collections.shuffle(년도);
		Collections.shuffle(월);
		Collections.shuffle(일);
		String text = 년도.get(0);
		String a = "";
		if (text.equals("19")) {
			a += ((int) (Math.random() * 69) + 50) + "";
		} else if (text.equals("20")) {
			Collections.shuffle(도);
			a += 도.get(0);
		}
		return a + 월.get(0) + 일.get(0) + "-";
	}

	public static String ran() { // 주민번호
		String text = "";
		String ran = "0123456789";
		for (int i = 0; i < 5; i++) {
			text += ran.charAt((int) (Math.random() * ran.length()));
		}
		return text;
	}

	public static String no4() { // 주민번호
		return (int) (Math.random() * 99) + 1 + "";
	}

}
