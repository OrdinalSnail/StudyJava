package ordinal.snail.java.sj_static;

import ordinal.snail.java.IExaminable;

/**
 *
 * @author d_mokharev
 */
public class StaticVariableExam implements IExaminable {

    @Override
    public void exam() {
        StaticVariableJob job1 = new StaticVariableJob("Job 1, id is");
        StaticVariableJob job2 = new StaticVariableJob("Job 2, id is");
        StaticVariableJob job3 = new StaticVariableJob("Job 3, id is");
        StaticVariableJob job4 = new StaticVariableJob("Job 4, id is");
        StaticVariableJob job5 = new StaticVariableJob("Job 5, id is");

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
