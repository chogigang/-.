package org.opentutorials.javatutorials.object;

public class CalculatorDemo {

	public static void main(String[] args) {
		// 아래의 로직이 1000줄 짜리의 복잡한 로직이라고 가정하자
		System.out.println( 10 + 20);//+가 중복된다.
		System.out.println( 20 + 40);
	}

}
/*프로그램의 기본은 중복의 제거이다 
 * 위값은 간단하지만 여러줄의 로직이 잡혀있으면 골치아프다
 * 그래서 우린 메소드라는걸 사용한다
 */
 