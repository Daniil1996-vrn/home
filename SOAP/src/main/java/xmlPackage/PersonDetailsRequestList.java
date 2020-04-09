package xmlPackage;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "Age"
})
@XmlRootElement(namespace = "https://www.howtodoinjava.com/xml/school",name = "PersonDetailsRequestList")
public class PersonDetailsRequestList {

    @XmlElement(namespace = "https://www.howtodoinjava.com/xml/school",required = true)
    protected Integer Age;

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
