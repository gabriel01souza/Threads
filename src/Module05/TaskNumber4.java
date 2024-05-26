package Module05;

public class TaskNumber4 implements Runnable {

    private final Bathroom bathroom;

    public TaskNumber4(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        while (true) {
            bathroom.cleanBathroom();

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
