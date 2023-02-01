package org.opentutorials.javatutorials.method;

public class MathodDemo3 {
	public static void numbering() {//이미 정해진 로직
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
	}
	
			
	public static void main(String[] args) {
		numbering();//재활용 할수있고
		numbering();//코드의 양을 줄일수가 있다.
		numbering();//유지 보수가 유리하다
		numbering();
	}
}
