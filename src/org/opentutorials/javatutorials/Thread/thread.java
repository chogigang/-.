package Thread;

public class thread {


    class MyThread extends Thread {
        public void run() { // Thread 클래스의 run()을 오버라이딩
           // 작업 내용
        }
    }
//Runnable 인터페이스 구현
public interface Runnable {
    public abstract void run();
}
   // static void sleep(long millis)//일정동안 쓰레드를 뭠추게 하는법
   // static void sleep(long millis, int nanos)//일정동안 쓰레드를 뭠추게 하는법


}
