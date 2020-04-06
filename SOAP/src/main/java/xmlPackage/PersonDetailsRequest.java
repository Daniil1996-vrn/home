package xmlPackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "Id"
})
@XmlRootElement(namespace = "https://www.howtodoinjava.com/xml/school",name = "PersonDetailsRequest")
public class PersonDetailsRequest {

    @XmlElement(namespace = "https://www.howtodoinjava.com/xml/school",required = true)
    protected Integer Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
