package hello2;

public class Hello2Class {
	public static void main(String[] args) {
		
		int st;   // 변수명은 숫자로 시작할 수 없다.
		int a;    // 변수명에 특수문자를 사용할 수 없다.
		int classa; // 키워드를 변수명으로 사용할 수 없다.
		
		// 안녕하세요
		// 나는 누구 입니다
		// 잘 부탁드립니다
		String b = "므요"; // 문자열 변수 선언
		String c = "뿔뱀이";
		a = 100;
		System.out.println("안녕하세요 ");
		System.out.println("나는 " + b + " 입니다 ");
		System.out.println( b + " 잘 부탁드립니다 ");
		System.out.println( b + "가 길을 가다가 " + c+ "를 만났네 ");
		System.out.print( b + "와 " + c + "의 호감도는 ");
		System.out.println(a);
		
	}
}
