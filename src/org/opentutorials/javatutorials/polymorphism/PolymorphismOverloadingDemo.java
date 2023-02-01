package org.opentutorials.javatutorials.polymorphism;//다형성
class O{
public void a(int param){
System.out.println("숫자출력");
System.out.println(param);
}
public void a(String param){//위 클래스의 이름은 같지만 매개변수가 다르다
System.out.println("문자출력");
System.out.println(param);
}
}
public class PolymorphismOverloadingDemo {
public static void main(String[] args) {
O o = new O();
o.a(1);;//매개변수가 숫자1이기때문에 public void a(int param) 메소드를 본체를 실행하게된다.
o.a("one");//매개변수 one이라는 인자를 줬기때문에 public void a(String param) 가 실행
} 
}







/*다형성은 오버로딩과도 조금 유사하다 같은 이름 다른 동작 방법 이라고 할 수 있기때문에 이것도 다양성이라고
 * 하는것이다.
 * 똑같은 메소드지만 매개변수로 무엇을 줬냐에 따라서 그 메소드는 public void a(int param)를 실행하거나
 * public void a(String param) 를 실행할수도 있는것이다.
 * 이것은 오버로딩을 통한 이 메소드에서 다양성이라고 할수가 있다.*/
