package org.opentutorials.javatutorials.object;

	class Calculator{

			int left, right;

				public void setOprands(int left, int right){
					this.left = left;//this.left는 위 클래스 Calculator 에 있는 left 값을 가져오는 행위이다.
					this.right = right;
					}
				public void sum(){
					System.out.println(this.left+this.right);
				}
				public void avg(){
					System.out.println((this.left+this.right)/2);
				}
			}
					public class CalculatorDemo4 {//카큘레이터 
						public static void main(String[] args) {
							Calculator c1 = new Calculator();//카큘레이터라는 객체를 새로 만들고 c1이라는 변수에 담았다 그변수는 카큘레이터라는 객체를 담을수있는 데이터형식을 가지고있는 변수여야한다.
							c1.setOprands(10, 20);//메소드 setOprands 연산의 대상의값을 의미 10,20 이라는 값을 setOprands라는 메소드의 인자값을 전달
							c1.sum();
							c1.avg();
							Calculator c2 = new Calculator();//c2로 new Calculator(); 의 변수를 대입하는걸을 인스턴스 라고 한다
							c2.setOprands(20, 40);//left값이 20 right 값이  40 이된다.
							c2.sum();
							c2.avg();
						}
					}

