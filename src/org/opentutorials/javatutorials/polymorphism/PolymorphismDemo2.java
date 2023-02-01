package org.opentutorials.javatutorials.polymorphism;
//인터페이스와 다향성 
interface I{}
class C implements  I{}
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		
		I obj = new C() ;
	}

}
/*어떠한 클래스가 어떠한 인터페이스를 구현하고 있다면 그 클래스의 인스턴스는 
 * 그인터페이스일 수 있다. 
 * C라고 하는 클래스가 인스턴스화 될때 데이터타입이 I인 이유는 
 * 클래스 C가 인터페이스 I를  구현하고 있기 때문이기다
 * 이것을 이해하는게 지금 이코드의 핵심이다.
 * 
 * */
