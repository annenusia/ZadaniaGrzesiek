package threads.basics;

import static java.lang.Thread.sleep;
import static threads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE+"Main thread in action");

        Thread otherThread = new OtherThread();
        otherThread.setName("======= OTHER THREAD");
        otherThread.start(); //!!!wywołujemy przez "start" mimo, że metoda przeładowana nazywa się "run"
        // (w klasie otherThread)

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        System.out.println(ANSI_PURPLE + "End of main");

        //wątek w klasie anonimowej
        new Thread() {
            public void run(){
                System.out.println(ANSI_GREEN + "Anonymous class based thread");
            }
        }.start();

        try {
            sleep(3000);
        } catch(InterruptedException e) {
            System.out.println(ANSI_BLUE + "sombody woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "enough! back to work");
    }
}
