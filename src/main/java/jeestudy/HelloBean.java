package jeestudy;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named
public class HelloBean {

    private String name;
    private String greeting ="default Hello!!";

    private String[] sampleArray = {"hoge","var","foo"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void doGreeting() {
        greeting = "Hello " + name;
    }


    public String[] getSampleArray() {
        return sampleArray;
    }

    public void setSampleArray(String[] sampleArray) {
        this.sampleArray = sampleArray;
    }

}