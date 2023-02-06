//참조- 복제
package org.opentutorials.javatutorials.reference;

class A {
	 public int id;
	 A(int id){
		 this.id = id;
	 }
}

public class ReferenceDemo1 {

    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a); //a값이 2인지 1인지 확인 하는것
/*      2가 출력하면 int b = a; 관계에 의해서 a값 1이였던것이 2가 됐다라는 뜻이다.
        하지만 출력값은 1이다 
        하지만 b를 2로 바꿔도 a값은 여전히 1이다 
        변수 b의 값에 변수 a의 값이 복제된 것이다.
    */
    }
 
    
   //참조란  
    public static void runReference(){
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println("runReference, "+a.id);     
    	}
    /*기본 데이터 타입이 아닌 뉴를 통해서 만드는 데이터 타입e 담겨 있는 변수 a는 서로 다르게 동작하고 있다는것을 알수있다.
    	수 b에 담긴 인스턴스의 id 값을 2로 변경했을 뿐인데 a.id의 값도 2가 됐다. 이것은 변수 b와 변수 a에 담긴 인스턴스가 서로 같다는 의미다.
		"참조는 전자화된 세계의 극치"
		"우리가 변수를 사용하는 이유도 말하자면 참조를 위해서라고 할 수 있을 것"
    */
    
        public static void main(String[] args) {
        runValue();
        runReference();
    }
 
}


/*new로 생성 하는 데이터들은 참조 자료 형이다.

*/



