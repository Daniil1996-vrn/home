package xmlPackage;

import com.soapService.SOAP.PersonForSoap;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "listPersonForSoap"
})

@XmlRootElement(name = "PersonDetailsResponseList")
public class PersonDetailsResponseList {

    @XmlElement(name = "listPerson", required = true)
    protected List<PersonForSoap> listPersonForSoap;

    public List<PersonForSoap> getListPersonForSoap() {
        return listPersonForSoap;
    }

    public void setListPersonForSoap(List<PersonForSoap> listPersonForSoap) {
        this.listPersonForSoap = listPersonForSoap;
    }
}
