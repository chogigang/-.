package org.opentutorials.javatutorials.loop;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			if (i == 5 )
				continue;// i 가 5가 되었을때 현제 반복문이 일단 종료가 되지만 그다음 반복문이 다시실행해서 9까지 출력한다 
		System.out.println("Coding Everybody" + i );
		}
	}

}
