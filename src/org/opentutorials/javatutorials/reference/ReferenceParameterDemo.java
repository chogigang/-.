package org.opentutorials.javatutorials.reference;
//메소드의 매개변수와 참조,복제
public class ReferenceParameterDemo {
	
	// 복제  runValue(); runValue, 1   호출부분
	static void _value(int b) {
		b = 2;
	}
	
	public static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue,"+a);
	}
	
	
	//참조  runReference1(); // runReference1, 1 호출부분
	static void _reference1(A b) {// A b = a;
		b = new A (2); // b = 인스턴스 값 2
	}
	 public static void runReference1(){
	        A a = new A(1);// A = 인스턴스 값  1
	        _reference1(a);
	        System.out.println("runReference1, "+a.id);     
	    }
	 
	 
	 // 참조  runReference2(); // runReference2, 2 호출부분
	 static void _reference2(A b){ // A b = a;
	        b.id = 2;//   b.id = 2; 를 선언했고   a=b 라는 것을 선언 했으며 둘은 같은 인스턴스를 참조 하고 있다 
	 }
	 
	 public static void runReference2(){
	        A a = new A(1);//a에 인스턴스를 담았고
	        _reference2(a);//인자로 전달했을때 reference2 실행
	        System.out.println("runReference2, "+a.id);//id 값은 2가 출력     
	    }
	 
	 
	 
	 public static void main(String[] args) {
	        runValue(); // runValue, 1
	        runReference1(); // runReference1, 1
	        runReference2(); // runReference2, 2
	    }
	 
	 
	}
	

