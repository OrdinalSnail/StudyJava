package org.example;

import java.io.*;
import java.util.List;

import static org.example.Formats.*;


public class ReportRenderer {

    private Formats format;
    private boolean removeLineEndings;
    private boolean writeBom;
    private String reportName;
    private String title;

    private OutputStream tempFile;


    public ReportRenderer(Formats format, boolean removeLineEndings, boolean writeBom, String reportName, String title) {
        this.format = format;
        this.removeLineEndings = removeLineEndings;
        this.writeBom = writeBom;
        this.reportName = reportName;
        this.title = title;
        begin(format);
    }


    private void begin(Formats format) {




        try {
            Path path = new Path("");
            tempFile = new FileOutputStream(File.createTempFile("temp-file-name", ".tmp"));
            if (writeBom) {
                //assume unique logic here
            }
            writeTitle(Formats format);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeTitle(Formats format) {
        switch (format) {
            case FORMAT_CSV:
                //assume unique logic is implemented here
                break;
            case FORMAT_XML:
                //assume unique logic is implemented here
                break;
            case FORMAT_HTML:
                //assume unique logic is implemented here
                break;
        }
    }


    public void writeHeader(List<String> headers) {
        if(headers == null || headers.isEmpty()){

            //some logic
        }


        if (removeLineEndings) {
            //assume unique logic is implemented here
        }
        switch (format) {
            case FORMAT_CSV:
                //assume unique logic is implemented here
                break;
            case FORMAT_XML:
                //assume unique logic is implemented here
                break;
            case FORMAT_HTML:
                //assume unique logic is implemented here
                break;
        }
    }


    public void writeRow(List<String> rowValues) {
        if (removeLineEndings) {
            //assume unique logic is implemented here
        }
        if (rowValues != null) {
            switch (format) {
                case FORMAT_CSV:
                    //assume unique logic is implemented here
                    break;
                case FORMAT_XML:
                    //assume unique logic is implemented here
                    break;
                case FORMAT_HTML:
                    //assume unique logic is implemented here
                    break;
            }
        }
    }

    public void finish() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(new File("report-storage", reportName + '.' + format.getName()));
            //assume unique logic is implemented here
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                }

                try {
                    tempFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
