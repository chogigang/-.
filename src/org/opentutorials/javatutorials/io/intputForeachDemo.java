package org.opentutorials.javatutorials.io;

public class intputForeachDemo {

	public static void main(String[] args) {
		for(String e: args) {
			System.out.println(e);
		}

	}

}

/*이번에는 이클립스로 직접  입력값을 줘서 실행하는것을 보여주는거임 
1.런 컨피규레이션 버튼 누르고 파일 플러스 아이콘 누르면 이 인자값 (입력값)을 넣을 수 있는 창이 뜸
2. 이름은 자기가 원하는거 아무거나 쓰고 우측 arguments 라는 탭 누르면 programs arguments  탭 나옴 
3. 여기다가 자기가 원하는 인자값을 입력하면되는데 입력하고 싶은게 좀 여러개면 ont two three 이렇게 띄어쓰기해서 구분하면됨 
4. 실행해보면 입력값 그대로 출력됨을 볼 수 있음 왜 그대로 입력값이 출력될 수 있었냐하면 
이번 메인 메소드 안의 내용(파라미터)이 
for each 라는 코드가 작성되어있는데 이건 변수에 담긴 값을 하나하나 개별로 꺼내서 담으라는내용임 each 구문 사용하려면 : <콜론을 사용함
5. 즉 우리가 지금 런 컨피규레이션을 통해 args 라는 변수에 one,two,three라는 것을 담음 그리고 이걸 e 라는 요 변수에다가 옮기라는 for each구문을 통해 args안의 있는 인자값을 e에다가 옮길 수 있었음 그래서 
최종 system.out.println(e); 입력 시 화면에 one,two,three 모두 다 출력될 수 있었음*/