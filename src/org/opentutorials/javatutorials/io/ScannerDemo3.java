package org.opentutorials.javatutorials.io;
import java.util.Scanner;
import java.io.*;
public class ScannerDemo3 {
//파일을 저장하는 것도 입력에 해당한다.
	public static void main(String[] args) {
		try {
			File file = new File("out.txt");//뉴파일이라는 객체를 생성 그객체는 out.txt라는 정보를 가지고있음
			Scanner sc = new Scanner(file);//파일은 변수 스캐너라는 객체를 생성할때 그 입력값으로 system.in을 주면 사용자가 입력하는 값 키보드를 통해서 입력하는 값을 얻어 와라 라는 뜻
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();	
		} catch(FileNotFoundException e) {//예외   FileNotFoundException e 는 "out.txt" 를 찾을수 없는 경우가 생긴다면 
			e.printStackTrace();//에러의 내용을 출력 하라는 명령어
			
		}

	}

}
/*자 cmd ,런 컨피규레이션을 통한 입력,콘솔에 직접입력해보기를 해봣는데 이번엔 파일을 통해 입력해보는 것을 알아보자


이번에 활용할건 파일종류중에서도 텍스트 (메모)파일이다


먼저 프로젝트 경로로 들어가서 우리가 코드에 입력 할  내용을 적은 파일을 만들어주고


그다음에 이 파일을 코드로 끌고와야한다

보면 호출명령문이 하나 더 추가되었는데 뭐 저건 우리 안배운거니까 넘어가자

먼저 file 선언부터 보자 =new file("메모이름");  즉 file이라는 변수에 우리가 지금 만든 메모안의 내용을 불러넣기 한거다 그럼 지금 file 안 내용이 1234가 되어있겠지

sc는 앞전에 배운대로 스캔 기능이고 그뒤에( file) 이 적혀져있다 

원래 요 앞전 강좌까지만해도 (system.in)이라고 써있는 이 영역에 file을 쓴것이다 원래 저영역에 넣는게 스캐너가 찾을 영역이기에 저기에 우리의 입력값을 담은 file이라는 변수를 찾아달라고 한거다 

그뒤에 반복문은 앞전과 똑같이 숫자가 맞으면 화면에 *1000을 한 값을 출력해달라는거고 

자 여기서 try랑 catch가 있는데 이건 예외라는 영역이다 오류가 나면 어떻게 할건지 알려달란건데  혹시라도 우리가 1234라는 값을 넣은 파일을 못 찾으면 얘가 곱하기를 못하니까 오류가 뜰거니 혹시라도 파일을 못 찾아서 오류가 뜨면 화면에 오류내용을 알려줘 라고 한 말임

gui  (그래픽 유저 인터페이스

gui는 그래픽유저 인터페이스 즉 이미지같이 그림체같은걸 통해 입력을해주는거임 
참고로 텍스트 언어로 작성하는건 cli라고함*/