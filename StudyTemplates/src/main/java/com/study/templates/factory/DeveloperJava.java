package com.study.templates.factory;

import java.util.function.Supplier;

/**
 *
 * @author d_mokharev
 */
public class DeveloperJava implements IDeveloper {

    static Supplier<IDeveloper> instFactory = () -> {
        return new DeveloperCpp();
    };

    public DeveloperJava() {
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }

    @Override
    public DeveloperType getType() {
        return DeveloperType.JAVA;
    }

}
