package threads.basics;

import static threads.ThreadColor.ANSI_BLUE;

public class OtherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "thread name : " + currentThread().getName());
    }
}
