//참조- 복제
package org.opentutorials.javatutorials.reference;

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
 
    public static void main(String[] args) {
        runValue();
    }
 
}


/*new로 생성 하는 데이터들은 참조 자료 형이다.

*/