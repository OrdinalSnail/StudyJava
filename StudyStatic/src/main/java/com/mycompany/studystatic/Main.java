package com.mycompany.studystatic;

/**
 *
 * @author d_mokharev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Job job1 = new Job("Job 1, id is");
        Job job2 = new Job("Job 2, id is");
        Job job3 = new Job("Job 3, id is");
        Job job4 = new Job("Job 4, id is");
        Job job5 = new Job("Job 5, id is");

        System.out.println();
        System.out.println("Now looking just on created objects");
        System.out.println();

        job1.getId();
        job2.getId();
        job3.getId();
        job4.getId();
        job5.getId();
    }

}
