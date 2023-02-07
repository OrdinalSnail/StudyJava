package ordinal.snail.java.sj_8;

import ordinal.snail.java.IExaminable;
import org.junit.Test;

import static org.junit.Assert.*;

public class OptionalExamTest {

    @Test
    public void exam() {
        IExaminable exam = new OptionalExam();
        exam.exam();
    }
}