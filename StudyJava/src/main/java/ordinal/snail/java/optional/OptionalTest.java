package ordinal.snail.java.optional;

import java.util.Optional;

/**
 *
 * @author d_mokharev
 */
public class OptionalTest {

    public static void go() throws Exception {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }

}
