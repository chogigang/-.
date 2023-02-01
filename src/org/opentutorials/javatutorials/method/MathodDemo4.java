package org.opentutorials.javatutorials.method;

public class MathodDemo4 {

	public static void numbering(int limit) {//넘버링에 int 정수에 limit 라는 변수를 지정 0~n까지
		int i = 0;//           매개변수(parameter)
		while (i< limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(5);//넘버링이라는 메소드에 5라는 입력값을 준다	
//               인자(argument)
	}
}
/*public static void numbering() {
		int limit = 5; 
		int i = 0;
		while (i< limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering();

	}    위 값아 같다 */

