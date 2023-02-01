package org.opentutorials.javatutorials.method;

public class MathodDemo5 {

		public static void numbering(int init,int limit) {//입력 값을 복수로 받고 싶다면 콤마 뒤에 매개변수를 정의해주면 된다. 또 이 메소스를 호출할 때는 매개변수의 순서대로 인자를 배치하면 된다.
			int i= init;         
			while (i< limit) {
				System.out.println(i);
				i++;
			}
		}
		public static void main(String[] args) {
			numbering(1,5);	               		
	}

}
