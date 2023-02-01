package org.opentutorials.javatutorials.scope;
//전역변수
public class ScopeDemo2 {
	static int i;//static 추가됨 그리고 클래스 스코프 데모 바로 밑에서 이루어 져있음 정적 변수 클레스변수라고 한다,전역변수라고한다 
	// 
	static void a() {
		i = 0;// int 가 없이 함수가 선언됨 만약 int i = 0 으로 고치면 0,1,2,3,4 가 출력 될것이다.
	}
	
	
	public static void main(String[] args) {
		for (i=0; i<5; i++) {//for문을 사용하기도전에 i 값을 할당만 했다.,int i = 0 으로 고치면 0,1,2,3,4 가 출력 될것이다.
			a();
			System.out.println(i) ;//무한히 0이 출력됨
		}
	}

}

/*메인이 실행이 될것이고 for 문이 돌면서 i 값이 0이 되고 i가 1씩 증가하며냐서5가 될때까지
반복문이 반복적으로 실행이 된다. 현재 i값은 0이고  현제 값은 0인 상태 그상태에서
a에 도달하게 되면 본체가 실행이 되고 그런대 i값은 전역 변수의 i값을 사용하기때문에
i값을 0으로 지정했다. 그러면 i값은 0이기때문에 프린트엘엔이 실행이 되고 0이; 출력
그후 1이 증가하면서 밑으로 갈때 a가 발동 하면서 i 값이 다시 0이되기때문에 무한히 0을 출력*/