package jeestudy.calc;


import jeestudy.domain.CalcBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcBeanTest {
    @Test
    void add() {
        CalcBean target = new CalcBean();
        Assertions.assertEquals(10, target.calc("5","5"));
    }

    @Test
    void getCount() {
        CalcBean target = new CalcBean();
        Assertions.assertEquals(1, target.count());
    }

    @Test
    void calc() {
    }

    @Test
    void count() {
    }
}