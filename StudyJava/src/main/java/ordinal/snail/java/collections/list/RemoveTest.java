package ordinal.snail.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Упражнения на удаление
 *
 * @author d_mokharev
 */
public class RemoveTest {

    public static void go() throws Exception {
        exercixe1();
        exercixe2();
        exercixe3();
    }

    /**
     * ЧТО ВЫВЕДЕТ КОМАНДНАЯ СТРОКА В ТРЕХ СЛУЧАЯХ И ПОЧЕМУ?
     */
    private static void exercixe1() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println("*****Упражнение 1. Ответ: " + list);
    }

    /**
     * ЧТО ВЫВЕДЕТ КОМАНДНАЯ СТРОКА В ТРЕХ СЛУЧАЯХ И ПОЧЕМУ?
     */
    private static void exercixe2() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("b") || list.get(i).equals("с")) {
                list.remove(i);
            }
        }
        System.out.println("*****Упражнение 2. Ответ: " + list);
    }

    /**
     * ЧТО ВЫВЕДЕТ КОМАНДНАЯ СТРОКА В ТРЕХ СЛУЧАЯХ И ПОЧЕМУ?
     */
    private static void exercixe3() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "b", "d"));
        try {
            for (String s : list) {
                if (s.equals("b")) {
                    list.remove(s);
                }
            }
            System.out.println("*****Упражнение 3. Ответ: " + list);
        } catch (Exception e) {
            System.out.println("*****Упражнение 3. Ошибка: " + e.toString() + "Нельзя удалить из потока for");
        }
    }

}
