package ordinal.snail.java.sj_collections.sj_list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 1) LinkedList в абсолютных величинах проигрывает ArrayList по потребляемой
 * памяти и по скорости выполнения операций 2) LinkedList предпочтительнее, при
 * вставке/удалении в середину списка или в случаях, когда необходимо
 * гарантированное время добавления элемента в список.
 *
 * @author d_mokharev
 */
public class ListTest {

    private ArrayList<Integer> arrList;
    private LinkedList<Integer> linkedList;

    public ListTest() {
    }

    public static void go() throws Exception {
        //ArrayListTest.go();
        //RemoveTest.go();
        //productivityTest1();
        productivityTest2();
    }

    private static void instantinateTest() {
        //List<Integer> list1 = new List<Integer>();//'List' is abstract; cannot be instantiated
        List<Integer> list2 = new ArrayList<Integer>();
        //List<Number> list3 = new ArrayList<Integer>();//can't be
        List<? extends Integer> list32 = new ArrayList<Integer>();
        //List<Integer> list4 = new ArrayList<Number>();//can't be
        List<Integer> list5 = new ArrayList<>();
        List<Number> list6 = new ArrayList<>();

    }

    public static void productivityTest1() {
        int count = 20000000;

        ArrayList<Integer> arr = new ArrayList<>();
        Date arrDate1 = new Date();
        for (int i = 0; i < count; i++) {
            arr.add(i);
        }
        Date arrDate2 = new Date();
        long dur1 = (arrDate2.getTime() - arrDate1.getTime()) / 1000;
        System.out.println("array: " + dur1);

        LinkedList<Integer> link = new LinkedList<>();
        Date linkDate1 = new Date();
        for (int i = 0; i < count; i++) {
            link.add(i);
        }
        Date linkDate2 = new Date();
        long dur2 = (linkDate2.getTime() - linkDate1.getTime()) / 1000;
        System.out.println("link: " + dur2);
    }

    public static void productivityTest2() {
        int count = 300000;

        ArrayList<Integer> arr = new ArrayList<>();
        Date arrDate1 = new Date();
        for (int i = 0; i < count; i++) {
            arr.add(i % 2, i);
        }
        Date arrDate2 = new Date();
        long dur1 = (arrDate2.getTime() - arrDate1.getTime()) / 1000;
        System.out.println("array in middle: " + dur1);

        LinkedList<Integer> link = new LinkedList<>();
        Date linkDate1 = new Date();
        for (int i = 0; i < count; i++) {
            link.add(i % 2, i);
        }
        Date linkDate2 = new Date();
        long dur2 = (linkDate2.getTime() - linkDate1.getTime()) / 1000;
        System.out.println("link middle: " + dur2);
    }

}
