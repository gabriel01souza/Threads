package Module03;

public class Main {

    /**
     *  SHARING THE SAME OBJECT AMONG SEVERAL ACTIVITIES...
     *  WHERE THE OBJECT JUST CAN HAVE ONE ACCESS AT A TIME
     * @param args
     */
    public static void main(String[] args) {
        var bathroom = new Bathroom();

        var person1 = new Thread(new TaskNumber1(bathroom), "John");
        var person2 = new Thread(new TaskNumber1(bathroom), "Mary");
        var person3 = new Thread(new TaskNumber1(bathroom), "Cleitoh");

        person1.start();
        person2.start();
        person3.start();
    }
}
