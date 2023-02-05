package ordinal.snail.java.sj_try_catch;

/**
 *
 * @author home
 */
public class TryCatch {

    public static void go() {
        test1();
    }

    private static void test1() {
        System.out.println("Result valid = " + callTryCatchFinally("3"));
        System.out.println("Result invalid = " + callTryCatchFinally("RRR"));
    }

    private static Integer callTryCatchFinally(String number) {
        try {
            System.out.println("inside TRY");
            return Integer.parseInt(number);
        } catch (Exception e) {
            System.out.println("inside CATCH");
            return -1;
        } finally {
            System.out.println("inside FINALLY");
            return -2;
        }

    }

}
