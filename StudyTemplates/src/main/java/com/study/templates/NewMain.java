package com.study.templates;

import com.study.templates.factory.FactoryMethod;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d_mokharev
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<ITemplate> templates = new ArrayList<>();
        templates.add(new FactoryMethod());
        for (ITemplate templ : templates) {
            templ.test();
        }
    }

}
