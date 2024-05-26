package Module06;


public class TaskAddElement implements Runnable {

    private List list;
    private int numberThread;

    public TaskAddElement(List list, int numberThread) {
        this.list = list;
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.addElements("Thread " + numberThread + " " + i);
        }
    }
}
