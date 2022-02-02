package com.study.templates.factory;

import java.util.function.Supplier;

/**
 *
 * @author d_mokharev
 */
public enum DeveloperType {

    JAVA(DeveloperJava.class, DeveloperJava.instFactory),
    PHP(DeveloperPhp.class, DeveloperPhp.instFactory),
    CPP(DeveloperCpp.class, DeveloperCpp.instFactory);

    private DeveloperType(Class value, Supplier<IDeveloper> inst) {
        this.value = value;
        this.inst = inst;
    }

    private Class value;
    private Supplier<IDeveloper> inst;

    public Class getValue() {
        return value;
    }

    public Supplier<IDeveloper> getInst() {
        return inst;
    }

}
