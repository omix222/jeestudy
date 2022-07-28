package jeestudy;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpServletRequest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SessionScoped
@Named
public class HelloBean implements Serializable {

    private String name;
    private String greeting ="default Hello!!";

    private String[] sampleArray = {"hoge","var","foo"};

    private List<MyItem> selectItems = Arrays.asList(new MyItem("Lavel1","Value1"),
            new MyItem("Lavel2","Value2"));
    private Map<Long, Boolean> selectedIds;

    private List<MyItem>myItems = Arrays.asList(
            new MyItem("アイテムA", "A"),
            new MyItem("アイテムB", "B"),
            new MyItem("アイテムC", "C"));

    public List<MyItem> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<MyItem> selectItems) {
        this.selectItems = selectItems;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Map<Long, Boolean> getSelectedIds() {
        return selectedIds;
    }

    public void setSelectedIds(Map<Long, Boolean> selectedIds) {
        this.selectedIds = selectedIds;
    }

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
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletRequest request = (HttpServletRequest)externalContext.getRequest();
        request.setAttribute("reqAttr","using requestScope");
        greeting = "Hello " + name;
    }

    public void doGreetingInModal() {
        greeting = "Hello InModal:" + name;
    }

    public String[] getSampleArray() {
        return sampleArray;
    }
    public void setSampleArray(String[] sampleArray) {
        this.sampleArray = sampleArray;
    }

}