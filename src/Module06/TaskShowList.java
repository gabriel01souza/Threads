package Module06;

public class TaskShowList implements Runnable {

    private List list;

    TaskShowList(List list) {
        this.list = list;
    }

    public void run() {
        synchronized (list) {
            // Wait method, just need to be called when list is not full, otherwise, the element list is already
            // full to be shown!
            if (!list.isFull()) {
                System.out.println("Indo dormir");
                waitMode();
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + " " + list.getElement(i));
            }
        }
    }

    private void waitMode() {
        try {
            list.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
