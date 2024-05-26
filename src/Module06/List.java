package Module06;

/**
 * Instead of using Vector(), first time I've practiced with this object.
 */
public class List {

    private String[] elements = new String[100];
    private int index = 0;

    public synchronized void addElements(String element) {
        this.elements[index] = element;
        this.index++;


        if (this.elements.length == index) {
            System.out.println("Terminou de adicionar os itens");
            this.notify();
        }
    }

    public int size() {
        return elements.length;
    }

    public String getElement(int position) {
        return this.elements[position];
    }

    public boolean isFull() {
        return this.elements.length == index;
    }
}
