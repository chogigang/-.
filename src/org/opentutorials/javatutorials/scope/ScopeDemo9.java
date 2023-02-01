package org.opentutorials.javatutorials.scope;
 
class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v);//this.는 C3 int v =10 을 인식 
    }
}
 
public class ScopeDemo9 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}

/*c1 이라는 인스턴스를 생성 했을때 
그러면 그 인스턴스의 인스턴스 자체 인스턴스 자신을 의미하는값이 this. 다
그리고 this가 붙게 되면 그 객체에 대한 전역에 의미를 갖게 된다.
*/