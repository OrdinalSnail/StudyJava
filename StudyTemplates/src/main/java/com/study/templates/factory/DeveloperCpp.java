package com.study.templates.factory;

import java.util.function.Supplier;

/**
 *
 * @author d_mokharev
 */
public class DeveloperCpp implements IDeveloper {

    static Supplier<IDeveloper> instFactory = () -> {
        return new DeveloperCpp();
    };

    public DeveloperCpp() {
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Cpp code");
    }

    @Override
    public DeveloperType getType() {
        return DeveloperType.CPP;
    }

}
