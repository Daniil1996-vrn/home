package com.soapService.SOAP;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

@Component
public class ListPersonForSoap {

    private static final List<PersonForSoap> listPFS = new ArrayList<PersonForSoap>();

    private Repository r;

    final String  fileName="C:\\Users\\Data\\Documents\\SOAP\\target\\classes\\persons.csv";

    @PostConstruct
    public void initData() throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(fileName);
        BufferedReader fin = new BufferedReader(new FileReader(f));

        String line;
        Scanner in = new Scanner(new File(fileName));

        while (in.hasNextLine()) {

            String buf = in.nextLine();
            if (buf.startsWith("id")) {
                ;
            } else {
                String[] bufArray = buf.split(";");

                int id = Integer.parseInt(bufArray[0]);
                String firstName = bufArray[1];
                String lastName = bufArray[2];
                Gender gender = Gender.valueOf(bufArray[3].toUpperCase());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

                LocalDate date = LocalDate.parse(bufArray[4], formatter);

                String Name = bufArray[5];

                LocalDate now = LocalDate.now();

                //Period p = new Period(date, now);

                Integer age = (int) ChronoUnit.YEARS.between(date, now);


                BigDecimal money = new BigDecimal(bufArray[6]);

                PersonForSoap bufObject = new PersonForSoap( id,  firstName,  lastName,  date, age, gender, Name, money);

                if (bufObject != null) {
                  listPFS.add(bufObject)  ;
                }

            }

        }



    }

    public PersonForSoap findPerson(Integer id) {
        Assert.notNull(id, "The Person id name must not be null");
        //PersonForSoap personForSoap=new PersonForSoap();
        for (PersonForSoap personForSoap : listPFS) {
            if (personForSoap.getId().equals(id)) {
                return personForSoap;
            }
        }
      //  return listPFS.get(id);
        return null;
    }

    public Stream<PersonForSoap> twoMethod(int age) {
        //BigDecimal valDouble = new BigDecimal(5000);
        return listPFS.stream().filter(s -> s.getAge() > age);


    }

}
