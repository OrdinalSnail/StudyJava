package ordinal.snail.java.sj_collections.sj_list;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import ordinal.snail.java.Util;

/**
 * Лист на основе массива:
 *
 * Плюсы:_______________________________________________________________________________________________________________
 * 1) возможности доступа к произвольному элементу по индексу за постоянное время_______________________________________
 * 2) минимум накладных расходов при хранении такого списка_____________________________________________________________
 * 3) вставка в конец списка в среднем производится так же за постоянное время__________________________________________
 * 4) n = 10, при n+1 , будет создан новый размером (n * 3) / 2 + 1, в него поместят все эл. + новый____________________
 * 5) При добавлении эл. время добавления будет больше, чем при записи элемента в готовую пустую ячейку_________________
 * 6) В среднем время вставки элемента в конец списка является постоянным_______________________________________________
 * 7) Удаление последнего элемента происходит за константное время______________________________________________________
 *
 * Минусы:______________________________________________________________________________________________________________
 * 1) При вставке/удалении эл. в середине - взывает перезапись всех элементов «правее» в списке на одну позицию влево___
 * 2) При удалении элементов размер массива не уменьшается, до явного вызова метода trimToSize().
 *
 * @author d_mokharev
 */
public class ArrayListTest {

    public ArrayListTest() throws Exception {

    }

    public static void go() throws Exception {
        test1_Capacity();

    }

    /**
     * Test 1. Study capacity;
     *
     * @throws Exception
     */
    public static void test1_Capacity() throws Exception {
        Util.msg("*****Тест 1. Проверка размера. TrimToSize Begin");
        ArrayList<Integer> arrList = new ArrayList<>(15);
        msgSize(arrList);
        Util.msg("add 8 values");
        arrList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        msgSize(arrList);
        Util.msg("trimToSize");
        arrList.trimToSize();
        msgSize(arrList);
        Util.msg("*****Тест 1. Проверка размера. TrimToSize End");

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
