package Queue;

import LinkedList.LinkedList;

/**
 * @author Roman_Andriiv
 */
public class Queue {
    private LinkedList list = new LinkedList();

    public void add(int element) {
        list.add(element);
    }

    public int get() {
        return list.remove(0);
    }

    public int size() {
        return list.size();
    }
}
