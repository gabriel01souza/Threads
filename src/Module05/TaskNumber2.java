package Module05;

public class TaskNumber2 implements Runnable {

    private final Bathroom bathroom;

    public TaskNumber2(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
         bathroom.doNumber01();
    }
}
