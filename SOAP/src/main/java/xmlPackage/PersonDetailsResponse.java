package xmlPackage;

import com.soapService.SOAP.PersonForSoap;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "personForSoap"
})
@XmlRootElement(name = "PersonDetailsResponse")
public class PersonDetailsResponse {
    @XmlElement(name = "PersonForSoap", required = true)
    protected PersonForSoap personForSoap;

    public PersonForSoap getPersonForSoap() {
        return personForSoap;
    }

    public void setPersonForSoap(PersonForSoap personForSoap) {
        this.personForSoap = personForSoap;
    }
}
