package dgsw.network.class23.Thread.Thread1;

public class Thread2 extends Thread{ //implements Runnable

    //작업구현
    public void run() {
        for (int i=0; i < 500; i++) {
            System.out.printf("t2 Thread : %d\n", i);
        }
    }

}
