package org.opentutorials.javatutorials.io;

import java.util.Scanner;//가저온다 자바 유틸이라는 Scanner 를 읽어온다.

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//(System.in 사용자가 입력한 값)에 sc 라는 변수에 담는다.
		int i= sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
/*이번엔 실행 하면서 입력값을 주는 방법에 대해 알아보자

이번에는 라이브러리라는 기능을쓸건데 

라이브러리는 편안하게 재사용할 수 있는 로직에 대한 모음집이랄까

자보면 먼저 우리는 이번에 컨피규레이터를 통해 매개변수에 값을 지정안했기때문에 1줄은 넘어가고 

2번째줄보면 (system.in);이라는 글은 사용자가 시스템에 직접 입력할 값 을 의미하는거다

그리고 new scanner은 라이브러리를 새로 만든다는 의미 즉 새로 만든 라이브러리는 유저가 직접 입력할거임 이라는 의미다 

3번째줄보면 i라는 변수에 뭘 대입하는데 sc.nextInt(); <느낌이온다 앞전에 배운 메소드 호출했던 구문이랑 비슷하다 맞다 메소드를 호출하고 있다는것이라고 한다 그럼 sc.nextInt는 무엇이냐 사용자가 입력할 값을 i라는 변수에 갖다주는 메소드에다 뭐라도 입력을해야  
 next(다음)으로 넘어간다는 뜻이다 i는 근데 int라는 데이터 타입이니 숫자만 입력하라는 뜻

그럼 마지막으로 화면 출력해봐 명령하면 우리가 입력한 숫자가 sc.nextInt라는 메소드를 통해 i에게 전달되고 i가*1000을 계산해서 나오는 것  클로즈는 여기서 말을끝내겠다 라는 온점같은 구문인가봄 

참고로 라이브러리 기능을 사용하려면 호출을 해야하는데 맨위에 패키지 다다음줄 보면

import라고 적혀져있는데 라이브러리 기능을 호출한다는 뜻이다 저게 써있어야 라이브러리 기능을 활성화해 사용 할 수 있다고 보면된다.*/