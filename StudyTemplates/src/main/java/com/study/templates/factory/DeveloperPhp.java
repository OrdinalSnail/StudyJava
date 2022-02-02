package com.study.templates.factory;

import java.util.function.Supplier;

/**
 *
 * @author d_mokharev
 */
public class DeveloperPhp implements IDeveloper {

    static Supplier<IDeveloper> instFactory = () -> {
        return new DeveloperCpp();
    };

    public DeveloperPhp() {
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer writes php code");
    }

    @Override
    public DeveloperType getType() {
        return DeveloperType.PHP;
    }

}
