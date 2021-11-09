package com.study.templates.factory;

/**
 *
 * @author d_mokharev
 */
public enum DeveloperType {

    JAVA(DeveloperJava.class),
    PHP(DeveloperPhp.class),
    CPP(DeveloperCpp.class);

    private DeveloperType(Class value) {
        this.value = value;
    }

    private Class value;

    public Class getValue() {
        return value;
    }

}
