package ordinal.snail.java.sj_stream_api.lambda;

/**
 *
 * @author d_mokharev
 */
public class UseFoo {

    public String add(String string1,String string2, Foo foo) {
        return foo.method(string1, string2);
    }

}
