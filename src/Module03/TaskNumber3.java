package Module03;

public class TaskNumber3 implements Runnable {

    private final Bathroom bathroom;

    public TaskNumber3(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
         bathroom.takeAShower();
    }
}
