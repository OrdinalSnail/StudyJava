package ordinal.snail.java.sj_stream_api.func_int;

import ordinal.snail.java.IExaminable;
import org.junit.Test;

import static org.junit.Assert.*;

public class FuncIntExamTest {

    @Test
    public void exam() {
        IExaminable exam = new FuncIntExam();
        exam.exam();
    }
}