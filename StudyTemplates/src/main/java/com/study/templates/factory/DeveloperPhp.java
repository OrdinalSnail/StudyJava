package com.study.templates.factory;

/**
 *
 * @author d_mokharev
 */
public class DeveloperPhp implements IDeveloper {

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
