package Module04;

/**
 *    Instead of using Vector(), first time I've practiced with this object.
 */
public class List {

    private String[] elements = new String[1000];
    private int index = 0;

    public synchronized void addElements(String element) {
        this.elements[index] = element;
        this.index++;
    }

    public int size() {
        return elements.length;
    }

    public String getElement(int position) {
        return this.elements[position];
    }
}
