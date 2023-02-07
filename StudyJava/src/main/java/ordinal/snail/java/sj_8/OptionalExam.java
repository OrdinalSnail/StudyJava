package ordinal.snail.java.sj_8;

import java.util.Optional;
import ordinal.snail.java.IExaminable;

/**
 *
 * @author d_mokharev
 */
public class OptionalExam implements IExaminable {

    @Override
    public void exam() {
        System.err.println("test null: ");
        String str = null;
        Optional<String> person = Optional.ofNullable(str);
        person.ifPresent(System.out::println);

        System.err.println("test empty: ");
        String str2 = "";
        Optional<String> person2 = Optional.of(str2);
        person2.ifPresent(System.out::println);

//        Optional<String> fullName = Optional.ofNullable(null);
//        System.out.println("Full Name is set? " + fullName.isPresent());
//        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
//        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }

}
