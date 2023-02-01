package org.opentutorials.javatutorials.polymorphism;//인터페이스와 다형성2 예시
interface father{}
interface mother{}
interface programmer{//프로그레머 는 코딩이라고하는 메소드를 강제 하고있다.
    public void coding();
}
interface believer{}
class Steve implements father, programmer, believer{//스티브는 집에서는 파더 이고 직장에서는 프로그래머고 종교에선 빌리버(신도)이다.
    public void coding(){//프로그레머가 있기때문에 코딩 이라고하는메소드를 강제한다.
        System.out.println("fast");
    }
}
class Rachel implements mother, programmer{//레이처는 집에서 엄마이기때문에 마더,그리고 직장은 프로그래머이기때문에 프로그래머 라고 인터페이스 했다.
    public void coding(){ //프로그레머가 있기때문에 코딩 이라고하는메소드를 강제한다.
        System.out.println("elegance");
    }
}
public class Workspace{//직장이다.
    public static void main(String[] args){
        programmer employee1 = new Steve();//스티브 라는 사람을  employee1 이고 하는 인스턴스로 만든다. 데이터타입은 프로그래머
        programmer employee2 = new Rachel();//레이철은   employee2 가지고있는대  프로그래머 라고 하는 인터페이스를 마찬가지로 구연하고있다.
//직장에서는 스티브랑 레이첼이 어떤 종교를 가지고 가정에서 어떤사람인지 신경 안써도 되기때문에 일부분만 사용하는것이다.        
        employee1.coding();
        employee2.coding();
    }
}