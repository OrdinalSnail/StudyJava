package ordinal.snail.java.sj_lambda;

import ordinal.snail.java.IExaminable;

/**
 *
 * @author d_mokharev
 */
public class LambdaExam implements IExaminable {

    @Override
    public void exam() {
        UseFoo useFoo = new UseFoo();
        Foo foo = (parameter, parameter1) -> parameter + " from lambda" + parameter1;
        String result = useFoo.add("Message ", "SEC ", foo);
        System.err.println(result);

//        Function<String, String> fn2 = parameter -> parameter + " from lambda";
//        String result2 = useFoo.add("Message ", fn2);
//        System.err.println(result2);
    }

}
