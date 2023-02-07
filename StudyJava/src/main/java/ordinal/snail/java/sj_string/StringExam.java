package ordinal.snail.java.sj_string;

import ordinal.snail.java.IExaminable;

public class StringExam implements IExaminable {


    public void exam() {
        String first = "Netifty";
        String second = "Netifty";
        System.out.print("Literal == literal: ");
        System.out.println(first == second); // True

        System.out.print("Literal == object: ");
        String firstNew = new String("Netifty");
        System.out.println(first == firstNew); // False

        System.out.print("Literal equals(object): ");
        System.out.println(first.equals(firstNew));

        System.out.print("Literal compareTo(object): ");
        System.out.println(first.compareTo(firstNew));

        firstNew = firstNew.intern();
        System.out.print("Literal == object.intern(): ");
        System.out.println(first == firstNew); // True
    }
}
