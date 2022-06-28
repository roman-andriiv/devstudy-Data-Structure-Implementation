package Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roman_Andriiv
 */
public class Stack {
    List<Object> list = new ArrayList<>();

    public void add(int element) {
        list.add(element);
    }
    public int get() {
        return (int) list.remove(list.size()-1);
    }
    public int size() {
        return list.size();
    }
}
