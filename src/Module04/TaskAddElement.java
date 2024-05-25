package Module04;

import java.util.List;

public class TaskAddElement implements Runnable {

    private List<String> list;
    private int numberThread;

    public TaskAddElement(List list, int numberThread) {
        this.list = list;
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add("Thread " + numberThread + " " + i);
        }
    }
}
