package hello2;

import java.util.Random;
import java.util.Scanner;

public class Hello2Class {
	public static void main(String[] args) {
		
		int st;   // 변수명은 숫자로 시작할 수 없다.
		int a;    // 변수명에 특수문자를 사용할 수 없다.
		int classa; // 키워드를 변수명으로 사용할 수 없다.
		int d;
		
		String b = "모험가"; // 문자열 변수 선언
		String c = "몬스터";
		a = 100;
		d = 0;
		System.out.println( "나는 " + b + " 입니다 ");
		System.out.println( b + "가 길을 가다가 " + c + "를 만났네 ");
		System.out.print( b + "의 체력은 ");
		System.out.println(a);
		System.out.print( b + "의 경험치는 ");
		System.out.println(d);
		System.out.println();
		
		// 몬스터의 마릿수
		int mon = 5;

		// 몬스터를 죽일 수 있는 횟수
		// 1번 몬스터는 2번
		// 2번 몬스터는 3번
		// 3번 몬스터는 1번
		// 4번 몬스터는 5번
		// 5번 몬스터는 10번
		Random rd = new Random();
//		int[] odds = {2, 3, 1, 5, 10};
		int[] odds = new int[5];
		for (int i1=0; i1<odds.length; i1++) {
			odds[i1] = rd.nextInt(10)+1;
		}  // for
		
		//몬스터 번호
		int monNo = 0;
		// 몬스터가 5마리
		// 각 몬스터 번호들을 출력
		// 몬스터 총 마릿수와 몬스터 끝 번호가 같으면 종료
		
		// 5번 몬스터 잡기를 참고 해서 나머지 몬스터들도 비슷하게 만들어 보자
		// 여기 부터 반복
		while (true) {
//			monNo++; // 몬스터 번호를 증가
			for (int i = 1; i <= odds[monNo] ; i++) {
			    System.out.println((monNo + 1) + "번 몬스터를 " + i + "회 공격했다");
			    // 만약에 몬스터의 체력만큼 공격 받으면
			    if (i == odds[monNo]) {
			        // 몬스터가 죽는다를 출력
			    	System.out.println("몬스터가 죽는다");
			    	mon = mon -1; // 몬스터의 수를 줄임
			    	System.out.println("경험치를 10 얻었다");
			    	d = d +10; 
			    	System.out.print( b + "의 경험치는 ");
					System.out.println(d);
			    	
			        // 체력만큼 공격 받지 않으면
			    } else {
			        // 몬스터가 죽지 않는다를 출력
			    	System.out.println("몬스터가 죽지 않는다");
			    	System.out.println("몬스터에게 반격 당했다");
			    	a = a -1;  //
			    	System.out.print( b + "의 체력은 ");
			    	System.out.println(a);
			    }  // else
			}  // for
		    monNo++;  // 다음 몬스터
			System.out.print( "남아있는 몬스터는? ");
			System.out.println(mon);
			System.out.println();  // 한줄 띄우기
			// 몬스터 총 마릿수와 몬스터 끝 번호가 같으면 종료
			// 반복 멈추기
			if (mon == 0) {
				break;
			}  // if
		}  // while	
		// 여기까지 반복
		System.out.println("몬스터 잡기 성공");
		
	}  // main
}  // class
