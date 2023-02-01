package org.opentutorials.javatutorials.scope;
 //
class C2 {
    int v = 10;
 
    void m() {
        int v = 20;//m이라는 값에 v의 값을 바꾸고 싶으면 따로 함수 를 설정 그럼 필요에따라 v 값을 다르게 설정할수있다 구체적인값일수록 우선순위가 더 높다.
        System.out.println(v);
    }
}
 
public class ScopeDemo8 {
 
    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.m();
    }
 
}