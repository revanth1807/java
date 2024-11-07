import java.io.*;
import java.lang.String;
public class RunnableThread implements Runnable{
    public void run(){
        System.out.println("The thread is created and executed");
    }
    public static void main(String args[]){
        RunnableThread ob=new RunnableThread();
        Thread t=new Thread(ob);
        t.start();
    }
}
