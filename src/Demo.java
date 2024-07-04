import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// using two thread simultaneously
public class Demo {
    public static void main(String[] args) throws NumberFormatException, IOException {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();


    }
}

class A extends Thread {
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


class B extends Thread {
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