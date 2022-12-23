/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studystatic;

/**
 *
 * @author d_mokharev
 */
public class Job {

    private static int count = 0;
    private final int jobID;
    private final String name;
    private final boolean isFilled;

    public Job(String title) {
        name = title;
        isFilled = false;
        jobID = ++count;
        System.out.println(name + ": " + jobID + " but count is" + count);
    }

    public void getId() {
        System.out.println(name + ": " + jobID + " but count is" + count);
    }
}
