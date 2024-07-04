import java.io.IOException;

// replacing Threads with the Runnable interface with anonymous classes using lamdas
public class ThreadL {
    public static void main(String[] args) {

        Runnable obj1 = () ->
            {
                for(int i = 1; i < 10; i++){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e) {
                        e.printStackTrace();

                    }
                }
        };

        Runnable obj2 = () ->
        {
            for(int i = 1; i < 10; i++){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e) {
                    e.printStackTrace();

                }
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

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
