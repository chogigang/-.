package org.opentutorials.javatutorials.constant2;
//상수2 enum
public class ConstantDemo {
	private final static int APPLE = 1;
    private final static int PEACH = 2;
    private final static int BANANA = 3;
    public static void main(String[] args) {
        int type = APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}
/*위와 같은 로직에서 숫자 1에 해당하는 과일은 언제나 사과여야 한다. 그러므로 변하지 않는 값인 상수값에 따라서 
 * 그 값에 해당하는 과일의 의미를 고정하고 있다. 그런데 주석으로 상수의 의미를 전달하고 있지만 주석이 없어졌거나, 
 * 주석이 상수를 사용하는 코드와 멀어진다면 각 숫자에 해당하는 과일이 무엇을 나타내는지 알아보기거 어렵거나 불가능해질 수 있다.
 *이런 때는 이름이 있다면 더 좋을 것이다. 변수도 상수가 될 수 있다. 변수를 지정하고 그 변수를 final로 처리하면 한번 설정된 변수의 값은 더 이상 바뀌지 않는다. 
 *또한 바뀌지 않는 값이라면 인스턴스 변수가 아니라 클래스 변수(static)로 지정하는 것이 더 좋을 것이다.
 */