package org.example;

import java.util.function.Consumer;

public enum Formats {

    FORMAT_CSV(1, "csv", new CsvProcesser()), FORMAT_XML(2, "xml"), FORMAT_HTML(3, "html");

    int i;
    String name;

    Formats(int i, String name, IFormatProcesser obj) {
    }


    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }






}
