package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {

		public static void sum(int left, int right) {
			System.out.println(left+right);
		}
	
	public static void main(String[] args) {
			sum(10,20);//리팩토링으로 더 간결하게 만듬
			sum(20,40);

	}

}
/*앞서 코드의 출력값은 동일하지만 메소드를 활용한 리팩토링을 통해 코드가 더 간결해졋다
 * 리팩토링을 할수록 더 간결해지며 버그잡기도 더 쉬워지고 건강한 코드로 바뀐다.
 * */
 