package ordinal.snail.java.sj_stream_api.func_int;

import java.util.function.*;

import ordinal.snail.java.IExaminable;

/**
 * @author d_mokharev
 */
public class FuncIntExam implements IExaminable {

    @Override
    public void exam() {

        //Predicate<T>: input<T> / output <boolean>
        //check and return boolean
        Predicate<String> predicate1 = t -> t == null || t.isEmpty();
        Predicate<String> predicate2 = t -> isNotEmpty(t);
        Predicate<String> predicate3 = t -> {return false;};
        predicate1.test(null);

        //Consumer<T>: input<T> / ---
        //make changes inside the object
        Consumer<String> consumer1 = t -> System.out.println(t);//don't return
        Consumer<IExaminable> consumer2 = t -> changeSomeObject(t);//do some inner changes
        Consumer<? extends Object> consumer3 = o -> {System.out.println(o.hashCode());};
        consumer1.accept("abc");
        consumer2.accept(new FuncIntExam());

        //Function<T,R>: input<T> / output<R>
        //conver T type to R type
        Function<Integer, String> function1 = t -> String.valueOf(t);
        Function<Integer, String> function2 = t -> convertToString(t);
        function1.apply(1);
        function2.apply(2);

        //Supplier<T>: --- / output T
        //instantiate a new object
        Supplier<String> supplier1 = this::getEmptyString;
        Supplier<String> supplier2 = () -> getEmptyString();
        Supplier<Double> supplier3 = () -> Math.random();
        Supplier<String> supplier4 = () -> {return "";};
        supplier1.get();

        //UnaryOperator<T>: input<T> / output<T>
        //make changes and return the Object
        UnaryOperator<String> uop1 = t -> t + "aaa";
        UnaryOperator<String> uop2 = t -> {return "";};
        UnaryOperator<IExaminable> uop3 = t -> changeSomeObjectAndReturn(t);
        uop3.apply(new FuncIntExam());

        //BinaryOperator<T>: input<T>+<T> / output<T>
        //take 2 objects anf return 1
        BinaryOperator<String> bop1 = (t1, t2) -> t1 + t2;
        BinaryOperator<String> bop2 = (t1, t2) -> {return t1 + t2;};
        BinaryOperator<String> bop3 = (t1, t2) -> concatStrings(t1, t2);
        bop1.apply("hello ", "friend");

    }

    public void PredicateExam() {
        Predicate<String> sss = (x) -> x.isEmpty();
    }

    public String getEmptyString() {
        return "";
    }

    private Integer getZeroInteger() {
        return 0;
    }

    private boolean isNotEmpty(String str) {
        return false;
    }

    private <T extends Object> void changeSomeObject(T object) {
        //some inner changes
    }

    private <T extends Object> T changeSomeObjectAndReturn(T object) {
        //some inner changes
        return object;
    }

    private String convertToString(Integer t) {
        return String.valueOf(t);
    }

    private String concatStrings(String str1, String str2) {
        return str1 + str2;
    }

}
