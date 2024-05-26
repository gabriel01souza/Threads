package Module06;


public class Main {

    /**
     * Using thread safe object, to try don't increment the index in the same time and leave a position into the list
     * wih the value "null"!
     */
    public static void main(String[] args) throws InterruptedException {
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
//        Vector is Thread safe!
//        List<String> list = new Vector();
        List list = new List();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new TaskAddElement(list, i));
            thread.start();
        }

        Thread.sleep(2000);

        new Thread(new TaskShowList(list)).start();
    }
}
