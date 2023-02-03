package org.opentutorials.javatutorials.progenitor;
// Object 클래스 toString 

class Calculator{
int left, right;
public void setOprands(int left, int right){
this.left = left;
this.right = right;
}
public void sum(){
System.out.println(this.left+this.right);
}
public void avg(){
System.out.println((this.left+this.right)/2);
}
public String toString(){
return "left : " + this.left + ", right : "+ this.right;
}
}
public class CalculatorDemo {
public static void main(String[] args) {
Calculator c1 = new Calculator();
c1.setOprands(10, 20);
System.out.println(c1);
System.out.println(c1.toString());
}
}



/* System.out.println(c1)하건 System.out.println(c1.toString()) 하건 결과는 같다 왜냐면 투 스트링 이라고 하는 메소드 호출을 명시적으로 하지않고
* 이 인스턴스를 담고 있는 변수 만을 프린트ln의 메소드 인자로 전달하게 되면 자바는 내부적으로 투스트링이라는 메소드를 호출하도록 약속이 되어 있기 때문이다.
* 이 Calculator 메소드가 뒤에 extends object라고 하는 이 클래스의 상속을 생략하고 있기 때문이다
* object안에는 toString 이라고 하는 메소드가 이미 정의가 되어 있어서 toString 호출 했을때는 오브젝트 클래스에 소지하고 있는 toString이라는 메소드를 사용하고 있는것이다.
**/

/*클래스 Calculator에 toString을 재정의(overiding)했다그리고 인스턴스를 System.out.println의 인자로 전달하니까 toString을 명시적으로 호출하지 않았음에도 동일한 효과가 나고 있다.
  toString 메소드는 자바에서 특별히 취급하는 메소드다. toString을 직접 호출하지 않아도 어떤 객체를 System.out.print로 호출하면 자동으로 toString이 호출되도록 약속되어 있다.
  이를 통해서 인스턴스 c1의 상태를 쉽게 파악할 수 있게 되었다.
 */
