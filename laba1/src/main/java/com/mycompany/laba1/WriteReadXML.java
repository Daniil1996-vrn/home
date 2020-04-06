package com.mycompany.laba1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@XmlSeeAlso(ArrayList.class)

@XmlRootElement(name = "personForXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class WriteReadXML {

    static Logger logger = LogManager.getLogger(WriteReadXML.class.getName());


    public void writeXMLinFile(/*ArrayList<IPerson> persons,*/ Repository rep,IPerson[] mass) throws JAXBException, IOException {

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

        File file=new File("C:\\Users\\Data\\Documents\\NetBeansProjects\\Laba1\\target\\classes\\persons.xml");

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(listpersonsforxml, System.out);

        //Marshal the employees list in file
        jaxbMarshaller.marshal(listpersonsforxml, file);

        List<String> list=Files.readAllLines(file.toPath(), Charset.defaultCharset());

        for (String str:list
             ) {
            logger.info(str );

        }


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
            IDivision div = new Division(personXML.getName());
            IPerson iperson=new Person(personXML.getId(),personXML.getFirstName(),personXML.getLastName(),
                    personXML.getGender(),personXML.getBirthdate(),div,personXML.getSalary());
            logger.info("Id:"+personXML.getId() + "\n"
                    + "FirstName:"+personXML.getFirstName() + "\n"
                    +"LastName:"+ personXML.getLastName() + "\n" +
                    "Birthdate:"+personXML.getBirthdate() + "\n"
                    +"Age:"+personXML.getAge()
                    +"Gender:"+ personXML.getGender() + "\n"
                    + "Salary:"+personXML.getSalary()+"\n");
            rep.add(iperson);

        }

     // return  listLPFX;
        return rep.toList();
    }


}
