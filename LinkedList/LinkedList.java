package LinkedList;

/**
 * @author Roman_Andriiv
 */
public class LinkedList {
    private Item first;
    private Item last;
    private int size;

    public void add(int element) {
        Item item = new Item(element);
        if (size == 0) {
            first = last = item;
        } else {
            last.setNext(item);
            item.setPrevious(last);
            last = item;
        }
        size++;
    }

    private Item findItem(int index) {
        int i = 0;
        Item current = first;
        while (i < size) {
            if (i == index)
                return current;
            else {
                i++;
                current = current.getNext();
            }
        }
        return null;
    }

    public int get(int index) {
        Item current = findItem(index);
        return current != null ? current.getValue() : 0;
    }

    public int remove(int index) {
        Item current = findItem(index);
        return current != null ? removeCurrent(current) : 0;
    }

    private int removeCurrent(Item current) {
        Item prev = current.getPrevious();
        Item next = current.getNext();
        if (next != null) {
            removeCurrentFromNext(next, prev);
        }
        if (prev != null) {
            removeCurrentFromPrevious(next, prev);
        }
        size--;
        if (size == 0) {
            first = last = null;
        }
        return current.getValue();
    }

    private void removeCurrentFromNext(Item next, Item prev){
        next.setPrevious(prev);
        if (prev == null) {
            first = next;
        }
    }

    private void removeCurrentFromPrevious(Item next, Item prev){
        prev.setNext(next);
        if (next == null) {
            last = prev;
        }
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        int i = 0;
        Item current = first;
        while (i < size) {
            array[i++] = current.getValue();
            current = current.getNext();
        }
        return array;
    }
}
