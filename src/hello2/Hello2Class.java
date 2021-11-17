package hello2;

public class Hello2Class {
	public static void main(String[] args) {
		
		int st;   // 변수명은 숫자로 시작할 수 없다.
		int a;    // 변수명에 특수문자를 사용할 수 없다.
		int classa; // 키워드를 변수명으로 사용할 수 없다.
		
		String b = "므요"; // 문자열 변수 선언
		String c = "뿔뱀이";
		a = 100;
		System.out.println("안녕하세요 ");
		System.out.println("나는 " + b + " 입니다 ");
		System.out.println( b + " 잘 부탁드립니다 ");
		System.out.println( b + "가 길을 가다가 " + c+ "를 만났네 ");
		System.out.print( b + "와 " + c + "의 호감도는 ");
		System.out.println(a);
		
		String b1 = "1회";
		String c1 = "2회";
		
		//나무의 갯수
		int tree = 5;
				
		//나무를 넘길 수 있는 횟수
		//1번 나무는 2번
		//2번 나무는 3번
		//3번 나무는 1번
		//4번 나무는 5번
		//5번 나무는 10번
		
		// 5번 나무찍기를 참고 해서 나머지 나무들도 비슷하게 만들어 보자
		
		for (int i = 0; i < 2; i++) {
		    System.out.println("1번 나무를 도끼로 " + (i + 1) + "회 찍었다");
		    // 만약에 2번이 찍혔으면
		    if (i == 1) {
		    // 나무가 넘어간다를 출력
		    	System.out.println("나무가 넘어간다");
		    // 2번이 아니면
		    } else {
		    // 나무가 넘어가지 않는다를 출력
		    	System.out.println("나무가 넘어가지 않는다");
		    }  // else
		}  // for
		
		System.out.print( "남아있는 나무는? ");
		tree = tree - 1;
		System.out.println(tree);
		
		for (int i = 0; i < 3; i++) {
		    System.out.println("2번 나무를 도끼로 " + (i + 1) + "회 찍었다");
		    // 만약에 3번이 찍혔으면
		    if (i == 2) {
		    // 나무가 넘어간다를 출력
		    	System.out.println("나무가 넘어간다");
		    // 3번이 아니면
		    } else {
		    // 나무가 넘어가지 않는다를 출력
		    	System.out.println("나무가 넘어가지 않는다");
		    }  // else
		}  // for
		
		System.out.print( "남아있는 나무는? ");
		tree = tree - 1;
		System.out.println(tree);
		
		for (int i = 0; i < 1; i++) {
		    System.out.println("3번 나무를 도끼로 " + (i + 1) + "회 찍었다");
		    // 만약에 1번이 찍혔으면
		    if (i == 0) {
		    // 나무가 넘어간다를 출력
		    	System.out.println("나무가 넘어간다");
		    // 1번이 아니면
		    } else {
		    // 나무가 넘어가지 않는다를 출력
		    	System.out.println("나무가 넘어가지 않는다");
		    }  // else
		}  // for
		
		System.out.print( "남아있는 나무는? ");
		tree = tree - 1;
		System.out.println(tree);
		
		for (int i = 0; i < 5; i++) {
		    System.out.println("4번 나무를 도끼로 " + (i + 1) + "회 찍었다");
		    // 만약에 5번이 찍혔으면
		    if (i == 4) {
		    // 나무가 넘어간다를 출력
		    	System.out.println("나무가 넘어간다");
		    // 5번이 아니면
		    } else {
		    // 나무가 넘어가지 않는다를 출력
		    	System.out.println("나무가 넘어가지 않는다");
		    }  // else
		}  // for
		
		System.out.print( "남아있는 나무는? ");
		tree = tree - 1;
		System.out.println(tree);
		
		for (int i = 0; i < 10; i++) {
		    System.out.println("5번 나무를 도끼로 " + (i + 1) + "회 찍었다");
		    // 만약에 10번이 찍혔으면
		    if (i == 9) {
		    // 나무가 넘어간다를 출력
		    	System.out.println("나무가 넘어간다");
		    // 10번이 아니면
		    } else {
		    // 나무가 넘어가지 않는다를 출력
		    	System.out.println("나무가 넘어가지 않는다");
		    }  // else
		}  // for
		
		System.out.print( "남아있는 나무는? ");
		tree = tree - 1;
		System.out.println(tree);
		
	}  // main
}  // class
