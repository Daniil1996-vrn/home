package com.soapService.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "listpersonsforxml")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListPersonsForXML {
    private List<PersonForXML> listPFX = null;

    public List<PersonForXML> getListPFX() {
        return listPFX;
    }

    public void setListPFX(List<PersonForXML> listPFX) {
        this.listPFX = listPFX;
    }
}
