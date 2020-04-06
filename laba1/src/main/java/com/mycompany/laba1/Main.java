/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import org.joda.time.DateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class Main is the main class of this program. Here: : 1) Create and
 * initialize Object date of class DateTime; 2) Create and initialize Object p
 * of class Person; 3) Call method difference_date() of class Person; 4) Create
 * and initialize Object с of class Repository; 5) Call method show of class
 * Repository; 6) Call method getelement of class Repository; 7) Call method
 * delete_element of class Repository;
 *
 *
 * @author Data
 */


public class Main {

    /**
     * This is constructor.
     */
    public Main() {

    }
     static  Logger logger = LogManager.getLogger(Main.class.getName());





    /**
     * In method "Msin" create adnd initialize objects and call methods.
     */
    public static void main(String[] args) throws Exception {


     //ReadXML

       Repository c2 = new Repository(1000);

        LoadRepository lp = new LoadRepository();

        WriteReadXML wrx=new WriteReadXML();

     //  List<PersonForXML> fromxMl=wrx.readXMLFromFile(lp.getR(),lp.getR().getMass());

     /*   for(IPerson p:wrx.readXMLFromFile(lp.getR(),lp.getR().getMass()))
        {
            System.out.println("Id:"+p.getId() + "\n"
                    + "FirstName:"+p.getFirstName() + "\n"
                    +"LastName:"+ p.getLastName() + "\n" +
                    "Birthdate:"+p.getBirthdate() + "\n"
                    +"Age:"+p.getAge()
                    +"Gender:"+ p.getGender() + "\n"
                    + "Salary:"+p.getSalary());

            System.out.println("");
        }*/


     //WriteXML

      /* LoadRepository lp = new LoadRepository();

        WriteReadXML wrx=new WriteReadXML();*/

       lp.readFromFileInRepository("C:\\Users\\Data\\Documents\\NetBeansProjects\\Laba1\\target\\classes\\persons.csv");

        ArrayList<IPerson> listPerson=new ArrayList<>();
        listPerson.addAll(lp.getR().toList());



        ArrayList<Person> listPerson2=new ArrayList<>();






        wrx.writeXMLinFile(lp.getR(),lp.getR().getMass());







    }

}
