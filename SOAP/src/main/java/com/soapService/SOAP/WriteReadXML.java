package com.soapService.SOAP;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.File;
import java.util.ArrayList;
import java.util.List;



@XmlSeeAlso(ArrayList.class)

@XmlRootElement(name = "personForXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class WriteReadXML {

    public void writeXMLinFile(/*ArrayList<IPerson> persons,*/ Repository rep,IPerson[] mass) throws JAXBException {

ListPersonsForXML listpersonsforxml=new ListPersonsForXML();

        listpersonsforxml.setListPFX(new ArrayList<PersonForXML>());
        //ArrayList<PersonForXML> personsForXML=new ArrayList<>();

        for(int i=0;i<rep.getMass().length;i++)
        {
            PersonForXML objpersonsForXML=new PersonForXML(rep.getMass()[i].getId(),
                    rep.getMass()[i].getFirstName(),
                    rep.getMass()[i].getLastName(),
                    rep.getMass()[i].getBirthdate(),
                    rep.getMass()[i].getAge(),
                    rep.getMass()[i].getGender(),
                    rep.getMass()[i].getDivision().getName(),
                    rep.getMass()[i].getSalary()
                    );
            listpersonsforxml.getListPFX().add(objpersonsForXML);
        }




        JAXBContext jaxbContext = JAXBContext.newInstance(ListPersonsForXML.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(listpersonsforxml, System.out);

        //Marshal the employees list in file
        jaxbMarshaller.marshal(listpersonsforxml, new File("C:\\Users\\Data\\Documents\\NetBeansProjects\\Laba1\\target\\classes\\persons.xml"));


     /*   File file = new File("C:\\file.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Repository.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(rep, file);
        jaxbMarshaller.marshal(rep, System.out);*/

    }

    public List<IPerson> readXMLFromFile(Repository rep, IPerson[] mass) throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(ListPersonsForXML.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        //We had written this file in marshalling example
        ListPersonsForXML listLPFX = (ListPersonsForXML) jaxbUnmarshaller.unmarshal( new File("C:\\Users\\Data\\Documents\\NetBeansProjects\\Laba1\\target\\classes\\persons.xml") );

        for(PersonForXML personXML : listLPFX.getListPFX())
        {
            IPerson iperson=new Person(personXML.getId(),personXML.getFirstName(),personXML.getLastName(),
                    personXML.getGender(),personXML.getBirthdate(),personXML.getName(),personXML.getSalary());
            rep.add(iperson);
        }

      return  rep.toList();
    }


}
