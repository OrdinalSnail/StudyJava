package ordinal.snail.java;

import java.util.Arrays;

/**
 * Utility class
 *
 * @author d_mokharev
 */
public final class Util {

    private Util() {
    }

    /**
     * Console msg
     *
     * @param str msg array
     */
    public static void msg(String... str) {
        System.out.println(Arrays.toString(str));
    }
}
