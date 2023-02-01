package org.opentutorials.javatutorials.method;

public class MathodDemo1 {
		public static void numbering() {//정의
			int i =0; 
			while (i<10) {
				System.out.println(i);
				i++;
			}
		
	}
		public static void main(String[] args) {
			numbering();//호출
			numbering();
			numbering();
		}
		
}
