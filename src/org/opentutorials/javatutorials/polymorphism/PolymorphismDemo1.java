package org.opentutorials.javatutorials.polymorphism;
class A{
public String x(){return "x";}
}
class B extends A{
public String y(){return "y";}
}
public class PolymorphismDemo1 {
public static void main(String[] args) {
A obj = new B();//클래스 b로 인스턴스를 만들었지만 그인스턴스는 클래스a의 데이터 타입을 행세를 하고있다.
obj.x();
//obj.y();//obj 은 a의 클래스를 행새하고있다 그러나 클래스a는 x값 바깨 없기때문에 오류가 나는것이다.
}
}

/*  수정판
class A{
public String x(){return "A.x";}//클래스 a의 메소드 x를 호출하면  리턴값은 A.x가 되어야한다.
}
class B extends A{
public String x(){return "B.x";}
//메소드x를 추가  그리고 이 메소드x는 클래스 a에 메소드x를 오버라이딩 하고있다 오버라이딩하면 이객체의 메소드가 우선순위가 더 높다.
 * 만약 메소드 x를 호출해 쓰면 클래스b에 소속되어 있는 메소드x를 호출했으면 리턴값이 B.x 가 출력 돼어야 한다
public String y(){return "y";}
}
public class PolymorphismDemo1 {
public static void main(String[] args) {
A obj = new B();//B를 인스턴스화 해서 클래스a 타입의 변수 obj 안에 담았다.
System.out.println(obj.x());// 실행 결과는 B.x 가 나온다 클래스 b의 메소드x를 실행한 결과가 나옴
}
*/


/*
 * 어떠한 클래스를 인스턴스화 시킬때 그 인스턴스를 담는 변수에 데이터타입은 그 클래스가 될수도 있고
 * 그클래스의 부모 클래스가 될수도 있다.
 * obj 이 인스턴스가 마치 부모클래스인a 인것처럼 동작할수 있고 부모클래스인 a에는 메소드y가 존재하지 않기때문에
 * 메소드y를 호출하면 에러를 발생시킨다 
 *
 * 어떠한 인스턴스가 클래스 a의 행세를 한다는것 클래스 b의 인스턴스가 클래스a 행세를 한다는것은 
   클래스 a에 정의되어있는 메소드 들만을 실행할 수 있다라는 것이고 클래스 b에서 추가적으로 
   정의한 메소드는 실행할수 없는것이다 하지만 클래스b에 있는 메소드가 어떠한 특정한 메소드가 
   그 상위 클래스에 있는 메소드를 오버라이딩 했다면 실행한것은 그 인스턴스화 시킨 클래스의 메소드를 실행시키게
   되는것이다.*/




/*class A{
public String x(){return "A.x";}
}
class B extends A{
public String x(){return "B.x";}
public String y(){return "y";}
}
class B2 extends A{
public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
public static void main(String[] args) {
A obj = new B(); //클래스b를 인스턴스화 시킨 오브젝트가있다 그리고 데이터 타입은 클래스b의 부모인 클래스a다
A obj2 = new B2();//클래스 b2를 인스턴스화 시킨 오브젝트는 위 클래스b 이고 b2클래스의 부모는 a이기때문에 a클래스는 b2의 부모클래스다.
System.out.println(obj.x());//정상 작동
System.out.println(obj2.x());//이건 오류가 걸린다.
}
}

* B,B2 둘다 부모클레스a 를 행세 하고 있기 때문에 부모 클래스 에서 정의한 메소드에 대해서만 호출을 할수가있다.
* 왜냐면 부모의 행세를 하고 있기 때문에 자식클래스에서 추가한 메소드는 사용하는 입장에서는 존재하지 않는것이다.
* 그러면서도 부모 자식 클래스에서 부모 클래스의 존재하는 매수를 들을 오버라이딩 했다면 실제 동작은 부모클래스의 
* x(){return "A.x";} 아니라 각각의 자식 클래스에서 오버라이딩 한 메소드의 내용이 실행이 된다는것이다.
* 동일한 데이터 타입으로 존재하면서 각각의 클래스를 정의되어 있는 메소드를 호출할때는 각각의 클래스에 소속
* 되어있는 메소드의 정의되어 있는 방식대로 동작한다 라는 점이 바로 다양성 이라고 하는것
*/
 