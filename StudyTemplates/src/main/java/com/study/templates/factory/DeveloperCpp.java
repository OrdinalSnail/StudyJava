package com.study.templates.factory;

/**
 *
 * @author d_mokharev
 */
public class DeveloperCpp implements IDeveloper {

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
