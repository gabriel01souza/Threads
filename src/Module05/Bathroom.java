package Module05;

public class Bathroom {

    private boolean isDirty = Boolean.TRUE;

    public synchronized void takeAShower() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is knocking on the door");

        System.out.println(threadName + " is Getting in the bathroom");

        while (isDirty) {
            waitOutside(threadName);
        }

        System.out.println(threadName + " is Taking a shower");

        intoTheBathroom(10000);
        this.isDirty = Boolean.TRUE;
        System.out.println(threadName + " is putting on the clothes");
        System.out.println(threadName + " is Getting out");

        // notifies a random thread to continue its activity.
        this.notify();
    }

    public synchronized void doNumber01() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is knocking on the door");

        System.out.println(threadName + " is Getting in the bathroom");

        while (isDirty) {
            waitOutside(threadName);
        }

        System.out.println(threadName + " is Doing a fast thing");

        intoTheBathroom(4000);
        this.isDirty = Boolean.TRUE;

        System.out.println(threadName + " is Washing the hand");
        System.out.println(threadName + " is Getting out");

        // notifies a random thread to continue its activity.
        this.notify();
    }

    private static void intoTheBathroom(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void cleanBathroom() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is Getting in the bathroom");

        if (!isDirty) {
            System.out.println("The bathroom is cleaned, I'm getting out!");
            return;
        }

        System.out.println(threadName + " is cleaning the bathroom");

        intoTheBathroom(8000);
        this.isDirty = Boolean.FALSE;

        System.out.println(threadName + " is getting out of the bathroom. It's cleaned.");

        // notifies a random thread to continue its activity.
        this.notify();
        // I could notify all thread using, but I'm notifying just the first of the row.
        // this.notifyAll();
    }

    private void waitOutside(String threadName) {
        System.out.println(threadName + " ew, the bathroom is dirty!");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
