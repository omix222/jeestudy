package jeestudy;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.Arrays;
import java.util.List;

@RequestScoped
@Named
public class HelloBean {

    private String name;
    private String greeting ="default Hello!!";

    private String[] sampleArray = {"hoge","var","foo"};

    public List<String> getListboxValues1() {
        return listboxValues1;
    }

    public void setListboxValues1(List<String> listboxValues1) {
        this.listboxValues1 = listboxValues1;
    }

    private List<String> listboxValues1;
    public class MyItem {
        private String myLabel;
        private String myValue;

        public MyItem(String myLabel, String myValue) {
            this.myLabel = myLabel;
            this.myValue = myValue;
        }

        public String getMyLabel() {
            return myLabel;
        }

        public void setMyLabel(String myLabel) {
            this.myLabel = myLabel;
        }

        public String getMyValue() {
            return myValue;
        }

        public void setMyValue(String myValue) {
            this.myValue = myValue;
        }

    }
    private List<MyItem>myItems = Arrays.asList(
            new MyItem("アイテムA", "A"),
            new MyItem("アイテムB", "B"),
            new MyItem("アイテムC", "C"));
    public List<MyItem> getMyItems() {
        return myItems;
    }
    public void setMyItems(List<MyItem> items) {
        this.myItems = items;
    }
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