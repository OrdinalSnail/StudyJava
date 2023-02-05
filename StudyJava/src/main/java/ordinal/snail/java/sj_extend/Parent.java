package ordinal.snail.java.sj_extend;

/**
 *
 * @author home
 */
public final class Parent {

    private final int inner;

    public Parent() {
        inner = 0;
    }

    private void privMethod() {
        System.out.println("privMethod");
    }

    protected void protMethod() {
        System.out.println("protMethod");
    }

    public void publMethod() {
        System.out.println("publMethod");
    }

    public int getInner() {
        return inner;
    }

}
