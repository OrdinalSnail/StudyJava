package ordinal.snail.java.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 1) LinkedList в абсолютных величинах проигрывает ArrayList по потребляемой памяти и по скорости выполнения операций
 * 2) LinkedList предпочтительнее, при вставке/удалении в середину списка или в случаях, когда необходимо гарантированное время добавления элемента в список.
 *
 * @author d_mokharev
 */
public class ListTest {

    private ArrayList<Integer> arrList;
    private LinkedList<Integer> linkedList;

    public ListTest() {
    }

    public static void go() throws Exception {
        ArrayListTest.go();
    }

}
