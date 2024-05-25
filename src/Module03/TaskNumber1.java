package Module03;

public class TaskNumber1 implements Runnable {

    private final Bathroom bathroom;

    public TaskNumber1(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
         bathroom.takeAShower();
    }
}
