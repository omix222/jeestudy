package jeestudy.domain;

import jakarta.enterprise.context.ApplicationScoped;

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
