package org.opentutorials.javatutorials.generic;
//제네릭 
class Person<T>{
    public T info;//밑 인스턴스 가  public T info  T자리로 들어오는 구조다 
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();//T자리에 <>안 내용이 들어오면서 인스턴스를 생성
        
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
 
}