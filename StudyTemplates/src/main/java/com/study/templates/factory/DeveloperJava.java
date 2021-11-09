package com.study.templates.factory;

/**
 *
 * @author d_mokharev
 */
public class DeveloperJava implements IDeveloper {

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
