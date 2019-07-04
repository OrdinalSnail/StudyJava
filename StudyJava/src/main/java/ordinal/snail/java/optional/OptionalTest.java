package ordinal.snail.java.optional;

import java.util.Optional;
import ordinal.snail.java.collections.list.ListTest;

/**
 *
 * @author d_mokharev
 */
public class OptionalTest {

    public static void go() throws Exception {
        System.err.println("test null: ");
        String str = null;
        Optional<String> person = Optional.of(str);
        person.ifPresent(System.out::println);

        System.err.println("test empty: ");
        String str2 = null;
        Optional<String> person2 = Optional.of(str2);
        person2.ifPresent(System.out::println);




//        Optional<String> fullName = Optional.ofNullable(null);
//        System.out.println("Full Name is set? " + fullName.isPresent());
//        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
//        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

    }

}
