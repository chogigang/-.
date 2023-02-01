package org.opentutorials.javatutorials.io;

public class inputDemo {

	public static void main(String[] args) {
			System.out.println(args.length);
	}

}
/*

String[] args 가 적힌 저기 구간은 메소드의 내용을 정의(메소드내용을 정하는것)하는 파라미터(parameter)라는 구간이다 지금 이고잉님이 작성하신 예제코드에 있는 파라미터 내용은  args라는 변수에 String이라는 데이터 타입 애들을 []형식으로 정의할거라는 말이다

그다음 main은 자바에서  실행(run)하는것을 의미한다

그다음 void 는 앞서 배운바와같이 메소드의 값을 호출할때 제약조건이 없다 라는 의미다 걍 (return)기능 안써도되 된다는말 

그리고 실행 구문에 있는 (args.length)는 args 라는 변수에 담겨있는 입력값의 수를 알려줘하는말이다

자그럼 이제 args라는 변수에 한번 입력값을 줘보자 

이번에는 입력값을 직관적?으로 보여주기위해 cmd 라는 기본 명령프로그램을 쓸거임 

1. 자 먼저 우리가 입력값을 줄 프로젝트가 있는 곳으로 가야한다 프로젝트 경로는 프로젝트 우클릭해서 프로퍼티스라는거 누르면 경로나옴
2.  자 프로젝트까지 경로이동했으면 java-cp bin org.opentutorials.javatutorials.io.InputDemo 입력 후 본인이 원하는 입력값을 입력하면됨 참고로 데이터 타입이 문자열이니 문자를 입력하면 좀 더 알아보기 쉬움
3. 그럼 자동으로 입력값이 반영된 최종 실행 결과가 나옴
*/