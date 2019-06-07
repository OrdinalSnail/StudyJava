package ordinal.snail.java.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import ordinal.snail.java.Util;

/**
 * study ArrayList
 *
 * @author d_mokharev
 */
public class ArrayListTest {

    public ArrayListTest() throws Exception {

    }

    /**
     * Get Capacity of ArrayList
     *
     * @param l incoming list
     * @return capacity
     * @throws Exception
     */
    public static String getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return String.valueOf(((Object[]) dataField.get(l)).length);
    }

    /**
     * Test 1. Study capacity;
     *
     * @throws Exception
     */
    public static void test1_Capacity() throws Exception {
        Util.msg("TrimToSize Begin");
        ArrayList<Integer> arrList = new ArrayList<>(15);
        msgSize(arrList);
        Util.msg("add 8 values");
        arrList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        msgSize(arrList);
        Util.msg("trimToSize");
        arrList.trimToSize();
        msgSize(arrList);
        Util.msg("TrimToSize End");

    }

    /**
     *
     * msg about capacity and size arraylist
     *
     * @param arrList
     * @throws Exception
     */
    private static void msgSize(ArrayList<Integer> arrList) throws Exception {
        Util.msg("Size:", String.valueOf(arrList.size()), " Capacity: ", getCapacity(arrList));
    }

}
