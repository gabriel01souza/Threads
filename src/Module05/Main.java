package Module05;

public class Main {

    /**
     *
     *  HERE WE'RE WORKING WITH THREADS IN WAIT MODE, AND NOTIFY THEM
     *
     */
    public static void main(String[] args) {
        var bathroom = new Bathroom();

        var person1 = new Thread(new TaskNumber1(bathroom), "John");
        var person2 = new Thread(new TaskNumber1(bathroom), "Mary");
        var person3 = new Thread(new TaskNumber2(bathroom), "Cleitoh");
        var cleaner = new Thread(new TaskNumber4(bathroom), "Cleaner");

        // This attribute tell us that this thread just works while there is any daemon thread working.
        // When the last person finish his/her activity, the cleaner stops.
        cleaner.setDaemon(true);

        person1.start();
        person2.start();
        person3.start();
        cleaner.start();
    }
}
