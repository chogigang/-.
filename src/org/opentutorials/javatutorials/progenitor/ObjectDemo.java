package org.opentutorials.javatutorials.progenitor;
//Object 클래스 :equals
class Student{
	String name;
	Student (String name){
		this.name = name;
	}
	public boolean equals(Object obj) {//데이터 타입이 오브젝트   obj 안으로 들어오는것은 s2
		Student  s =(Student)obj;//Student s = obj;는 오류가난다 부모클래스가 자식클래스 행세는 불가능하다. 
		
		return this.name == s. name;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//false

	}

}
/*s1,s2 에 내부적인 상태인 네임이 현재 egoing 이다
 * 두개의 객체를 비교했을때 두개의 객체는 같은 객체다 라고 이퀄스가 동작하도록 코드를 바꿀수가 있다.
 * 기본적으로 2개가 다른 객체로 인지하게 할 수도 있지만 원하는것에 따라서 만약 두개의 객체의 상태가 같다면
 * name 이라는 변수에 값이 같다면 구 두개는 같은것으로 간주한다 하고 코딩할수 있다는것
 * 그때 사용하는것이 .equals 라고 하는 오브젝트 메소드를 하위 클래스인 Student 에서 오버라이딩 
 * 재정의 하는것을 통해서 그것을 할수있다.
 *
 * 자식 데이터 타입을 부모 데이터 타입을 갖고 있는 변수에 할당 하려고  있는데 이것은 예전에 다향성에 대한
 * 수업을 할때 배웠던 내용 자식데이터 타입은 부모 데이터타입 에 할당 될수 있다라는것이 이 매개변서 레벨에서 일어나고 있는것
 * 
 * s2를 오브젝트 타입 으로 하게 되면  s2가 갖고 있는 변수 긴 name이라고 하는 값에 접근할 수가 없습니다
 * Object데이터 타입에는 네임이라고 하는 맴버가 존재하지않기 때문에 이 정의는 다형성에서 다시 볼수 있다.
 * 
 * 쉽게 말해 부모클래스가 자식클래스 행세를 할수가 없다는 것이다.
 * 
 * 부모가 자식 행세를 하면 어러가지 문제점을 만들수가 있기 때문에 명시적아로 나는 형변환을 할거라고 Student  s=(Student)obj 이렇게
 * 지정을 해줘야하지만 형변환을 허용하는 정책을 자바는 가지고 있다.
 * */
 