package dgsw.network.class23.Thread.Thread1;

import dgsw.network.class23.Thread.Thread1.Thread1;
import dgsw.network.class23.Thread.Thread1.Thread2;

public class ThreadMain {

    public static void main(String[] args) {
//        Thread1 mi1 = new Thread1();
//        Thread t1 = new Thread(mi1);
        Thread1 t1 = new Thread1();

//        Thread2 mi2 = new Thread2();
//        Thread t2 = new Thread(mi2);
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        for (int i=0; i < 500; i++) {
            System.out.printf("main Thread : %d\n", i);
        }
    }

}
