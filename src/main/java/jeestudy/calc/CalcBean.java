package jeestudy.calc;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;

//@RequestScoped
@ApplicationScoped
public class CalcBean {
    private int count;
    public int calc(String arg1,String arg2) {
        int result = Integer.parseInt(arg1) + Integer.parseInt(arg2);
        return result;
    }
    public int count(){
        return ++count;
    }
}
