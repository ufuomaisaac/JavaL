import java.io.IOException;

// replacing Threads with the Runnable interface with anonymous classes using lamdas
 class Counter {
     int count;

     //The keyword snchronized is used here for thread safety
     public synchronized void increment() {
         count++;
     }

}
public class ThreadL {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () ->
            {
                for(int i = 1; i <= 1000; i++){
                   c.increment();
                }
        };

        Runnable obj2 = () ->
        {
            for(int i = 1; i <= 1000; i++){
                c.increment();
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //join function is used to allow t1 to finish its task before continuing with the main Thread
        t1.join();

        //join function is used to allow t12to finish its task before continuing with the main Thread
        t2.join();

        System.out.println(c.count);

    }
}

/*
class A implements Runnable {
    public void run() {
        for(int i = 1; i < 1000; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}


class B implements Runnable {
    public void run() {
        for(int i = 1; i < 1000; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/
