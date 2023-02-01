package org.opentutorials.javatutorials.io;
import java.util.Scanner;//가저온다 자바 유틸이라는 Scanner 를 읽어온다.
public class ScannerDemo2 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//(System.in 사용자가 입력한 값)에 sc 라는 변수에 담는다.
		while(sc.hasNextInt()) {//sc는 스캐너가 담겨져있는 변수 hasNextInt()는 스캐너 객체가 갖고있는 메소드를 호출
			System.out.println(sc.nextInt()*1000);//사용자 입력값이 숫자면 출력 
		}
		sc.close();// 사용자 입력값이 문자면 false 이기 때문에 중단
	}

}
