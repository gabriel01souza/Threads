package Module03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bathroom {

    private Lock lock = new ReentrantLock();

    public void takeAShower() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is knocking on the door");

        lock.lock();
            System.out.println(threadName + " is Getting in the bathroom");
            System.out.println(threadName + " is Taking a shower");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadName + " is putting on the clothes");
            System.out.println(threadName + " is Getting out");
        lock.unlock();
    }

    public void doNumber01() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is knocking on the door");

        synchronized (this) {
            System.out.println(threadName + " is Getting in the bathroom");
            System.out.println(threadName + " is Doing a fast thing");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadName + " is Washing the hand");
            System.out.println(threadName + " is Getting out");
        }
    }

}
