/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import sun.security.util.Length;
import org.joda.time.format.*;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Class Repository is intended for store objects class Person. Field Size
 * -describe size massiv which store objects class Person Method getSize -
 * return field size Method setSize - set field size Method add - add object
 * type Person in array mass of type Person for store objects class Person
 * Method show(Person [] mass2) receive argument as massiv objects of class
 * Person and show it elements Method getelement(Person [] mass2,int index)
 * receive argument as massiv objects of class Person and index element massiv
 * and show element massiv Method delete_element(int index) receive index
 * element massiv and delete this element
 *
 *
 * @author Data
 */
public class Repository {

    /**
     * Field size store size massiv.
     */
    private int size;

    private Person[] mass;

    private int count = 0;

    /**
     * This is constructor. In constructor we initialize property size and array
     * mass of type Person
     *
     *
     * @author Data
     * @param size
     */
    public Repository(int size) {
        this.size = size;
        mass = new Person[size];
    }

    /**
     * Method setSize set size.
     *
     * @param size
     */
    public final void setSize(int size) {
        this.size = size;
    }

    /**
     * Method getSize return size.
     *
     * @return
     */
    public final int getSize() {
        return size;
    }


    public void add(Person obj) throws Exception {

        /* if (count == size)
        {
        int currentCapacity = mass.length;
        Person[] tempArr = new Person[currentCapacity + currentCapacity];
        for(int i = 0; i < mass.length; i++) {
            tempArr[i] = mass[i];
        }
        mass = tempArr;


        }*/
        int firstLength=mass.length;
        for (int i = 0; i < mass.length; i++) {

             if(mass[i]!=null &&i==mass.length-1)
               {
                    int currentCapacity = mass.length;
        Person[] tempArr = new Person[currentCapacity*2];
        for(int j = 0; j < currentCapacity; j++) {
            tempArr[j] = mass[j];
        }
       // mass = new Person[tempArr.length];
      mass=tempArr;

    //    mass[currentCapacity]=obj;
     //   break;
               }
              if (mass[i] == null ) {
                mass[i] = obj;
                break;
            }


        }





        //else

    }

    public void  add(int index, Person person) throws Exception
    {
        if(mass[index]==null) mass[index]=person;
        else throw new Exception("This index contains element");
    }

    public Person get(int index)
    {
        return mass[index];
    }

    public List<Person> toList() {
        ArrayList<Person> arr = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]!=null)
            arr.add(mass[i]);
        }
        return arr;
    }

    /**
     * Method show() show elements array mass of type Person
     *
     */
    public final void show() {
        System.out.println("Show elements massiv:");
        System.out.println(mass.length);
        for (int i = 0; i < mass.length; i++) {
            Person el = mass[i];
            if(mass[i]==null) ;
            else
            {
            System.out.println("Id:" + el.getId() + "\n" + "Name:"
                    + el.getName() + "\n" + "Date:" + el.getDate() + "\n" + "Sex:" + el.getSex() + "\n");
            }
        }
    }

    /**
     * Method getelement(Person [] mass2,int index) receive argument as massiv
     * objects of class Person and index element massiv and show element massiv.
     *
     * @param index
     */
    public final String getelement(final int index) {

        // System.out.println("Get element for index:" + index);
        return "Id:" + mass[index].getId() + "\n"
                + "Name:" + mass[index].getName() + "\n"
                + "Date:" + mass[index].getDate() + "\n" + "Sex:"
                + mass[index].getSex() + "\n";

    }

    /**
     * Method delete_element(int index) receive index element massiv and delete
     * this element.
     *
     * @param index
     */
    public final Person[] deleteElement(int index) {

        int size2 = mass.length - 1;
        Person[] mass2 = new Person[size2];
        System.arraycopy(mass, 0, mass2, 0, index);
        System.arraycopy(mass, index + 1, mass2, index,
                mass.length - index - 1);
        System.out.println("Massiv without element with index:" + index);
        //   count--;
        mass = new Person[size2];
        System.arraycopy(mass2, 0, mass, 0, size2);
        return mass;

    }

     /** Method searchByParam take two parametr:
      * @param  value - string for search.
     * @param  numberParam - number which take:
     * 1- field "ID";
     * 2 -field "Name"
     * 3- field "Date;
     * 4-field "sex".
 *
 */




    public Person[] getMass() {
        return mass;
    }

    public Person[] searchByParam(String value, int numberParam) throws Exception {
        int firstIndexNull=0;

        Person[] search=new Person[mass.length] ;


        int countNotNullElement=0;
        switch (numberParam) {
            case 1: {
                for (int i = 0; i < mass.length; i++) {
                    int buf = Integer.parseInt(value);
                    if (mass[i].getId()==buf) {
                        search[i] = mass[i];

                    } /*else {
                    throw new Exception("not found");
                    //System.out.println( mass[i].getId());

                    }*/

                }

            }
            break;
            case 2: {
                for (int i = 0; i < mass.length; i++) {

                    if (mass[i].getName() == value) {
                        search[i] = mass[i];

                    }

                    /*else {
                    throw new Exception("not found");
                    //System.out.println( mass[i].getId());

                    }*/

                }
                //  if(search.length==0)  throw new Exception("not found");
            }

            break;

            case 3: {

                /* String buf=value;
                int indexWhiteSpace=value.indexOf(" ");
                String valueDate=value.substring(0, indexWhiteSpace);
                String str[] = valueDate.split("/");



                String valueTime=value.substring(indexWhiteSpace+1,value.length());
                String str2[] = valueTime.split("/");

                System.out.println(valueDate+"\n"+valueTime);

                int day = Integer.parseInt(str[0]);
                int month = Integer.parseInt(str[1]);
                int year=Integer.parseInt(str[2]);
                int hour=Integer.parseInt(str2[0]);
                int minutes=Integer.parseInt(str2[1]);
                int seconds=Integer.parseInt(str2[2]);*/
                DateTime date = DateTime.parse(value,
                        DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));

                /* Period p1 = new Period(date);
                long year = p1.getYears();
                long month=p1.getMonths();
                long day=p1.getDays();
                long hour=p1.getHours();
                long minutes=p1.getMinutes();
                long seconds=p1.getSeconds();*/
                for (int i = 0; i < mass.length; i++) {

                    Period p2 = new Period(mass[i].getDate(),date);
                    int year2 = p2.getYears();
                    int month2=p2.getMonths();
                    int day2=p2.getDays();
                    int hour2=p2.getHours();
                    int minutes2=p2.getMinutes();
                    int seconds2=p2.getSeconds();
                    //if (year==year2 && month==month2 && day==day2 && hour==hour2 && minutes==minutes2 && seconds==seconds2)
                    if (mass[i].getDate().toLocalDate().isEqual(date.toLocalDate())) {
                        search[i] = mass[i];

                    } /*else {
                    throw new Exception("not found");
                    //System.out.println( mass[i].getId());

                    }*/

                }
            }
            break;

            case 4: {
                for (int i = 0; i < mass.length; i++) {



                    if (mass[i].getSex() == value ) {
                        search[i] = mass[i];

                    } /*else {
                    throw new Exception("not found");
                    //System.out.println( mass[i].getId());

                    }*/
                    // else ;

                }

            }

            break;

        }
        for(int i=0;i<search.length;i++)
        {
            if(search[i]!=null)
            {
                countNotNullElement++;
                // break;
            }
        }

        Person[] temp=new Person[countNotNullElement];

        for(int i=0;i<search.length;i++)
        {
            for(int j=0;j<temp.length;j++)
                if(search[i]==null);
                else temp[j]=search[i];
        }

        // System.arraycopy(search, 0, temp, 0, firstIndexNull);
        search=temp;
        return search;
    }

    /** Method bubbleSort take one parametr
     * @param  numberParam - number which take:
     * 1(sort by field "ID")
     * 3(sort by field "Date")
 *
 */
    public Person[] bubbleSort(int numberParam) {
        switch (numberParam) {
            case 1: {
                for (int i = 0; i < mass.length; i++) {
                    for (int j = mass.length-1 ; j > i; j--) {
                        if (mass[j - 1].getId() > mass[j].getId()) {
                            Person buf = mass[j - 1];
                            mass[j - 1] = mass[j];
                            mass[j] = buf;
                        }

                    }
                }

            }
            break;

            case 3: {
                for (int i = 0; i < mass.length ; i++) {
                    for (int j = mass.length-1 ; j > i; j--) {
                        if (mass[j - 1].getDate().isAfter(mass[j].getDate())) {
                            Person buf = mass[j - 1];
                            mass[j - 1] = mass[j];
                            mass[j] = buf;
                        }

                    }
                }
            }
            break;
        }
        return mass;
    }

    /** Method bubbleSort take one parametr
     * @param  insertionSort - number which take:
     * 1(sort by field "ID")
     * 3(sort by field "Date")
 *
 */
    public Person[] insertionSort(int numberParam) {
        switch (numberParam) {
            case 1: {
                Person temp;
                int item;
                for (int counter = 1; counter < mass.length; counter++) {
                    temp = mass[counter];
                    item = counter - 1;
                    while (item >= 0 && mass[item].getId() > temp.getId()) {
                        mass[item + 1] = mass[item];
                        mass[item] = temp;
                        item--;
                    }
                }

            }
            break;

            case 3: {

                Person temp;
                int item;
                for (int counter = 1; counter < mass.length; counter++) {
                    temp = mass[counter];
                    item = counter - 1;
                    while (item >= 0 && mass[item].getDate().isAfter(temp.getDate())) {
                        mass[item + 1] = mass[item];
                        mass[item] = temp;
                        item--;
                    }
                }
            }
            break;
        }
        return mass;
    }

    public Person[] readFromFileInRepository(String fileName) throws FileNotFoundException, IOException, Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(fileName);
        BufferedReader fin = new BufferedReader(new FileReader(f));

        String line;
        Scanner in = new Scanner(new File(fileName));

      // while ((line = fin.readLine()) != null)
    // for(int i=0;i<100;i++)
     while (in.hasNextLine())
        {
            //System.out.println(line);
            String buf=in.nextLine();
            if(buf.startsWith("id"))
            {
                ;
            }
            else
            {
            String [] bufArray=buf.split(";");







                /*mass[j].setId(Integer.parseInt(bufArray[0]));
                mass[j].setFirstName(bufArray[1]);
                mass[j].setLastName(bufArray[2]);
                mass[j].setGender((Gender.valueOf(bufArray[3].toUpperCase())));
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//formatter = formatter.withLocale( putAppropriateLocaleHere );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
LocalDate date = LocalDate.parse(bufArray[4], formatter);
               mass[j].setBirthdate(date);
               mass[j].setName(bufArray[5]);
               BigDecimal money = new BigDecimal(bufArray[6]);
               mass[j].setSalary(money);*/


              int id=  Integer.parseInt(bufArray[0]);
               String firstName= bufArray[1];
               String lastName=bufArray[2];
                Gender gender=Gender.valueOf(bufArray[3].toUpperCase());
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//formatter = formatter.withLocale( putAppropriateLocaleHere );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
                LocalDate date = LocalDate.parse(bufArray[4], formatter);

               String Name=bufArray[5];
               BigDecimal money = new BigDecimal(bufArray[6]);


             Person bufObject=new Person( id,   firstName, lastName, date, gender, Name, money);
             if(bufObject!=null)
                add(bufObject);

          /*  System.out.println(
                    "Id:"+id+"\n"
                    +"First name:"+firstName+"\n"
                    +"Last name:"+lastName+"\n"
                      +"Gender:"+gender+"\n"
                     +"Birthdate:"+date+"\n"
                    +"Division:"+Name+"\n"
                    +"Salary:"+money+"\n\n"

            );*/


            }




        }
       // return mass;
     //  show();
        return mass;
    }

}
