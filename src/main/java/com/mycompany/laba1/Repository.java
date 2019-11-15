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
import java.util.Arrays;
import java.util.Comparator;
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

    public Person  set(int index, Person person)
    {
         mass[index]=person;
         return person;

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
                    + el.getName() + "\n" + "Date:" + el.getBirthdate() + "\n" + "Sex:" + el.getGender() + "\n");
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
                + "Date:" + mass[index].getBirthdate() + "\n" + "Sex:"
                + mass[index].getGender() + "\n";

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

     public static Comparator<Person> id = new Comparator<Person>() {

        @Override
        public int compare(Person p1, Person p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return (int) (p1.getId()-p2.getId());
        }
    };

     public static Comparator<Person> firstName = new Comparator<Person>() {

        @Override
        public int compare(Person p1, Person p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    };

      public static Comparator<Person> lastName = new Comparator<Person>() {

        @Override
        public int compare(Person p1, Person p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;
            return p1.getLastName().compareTo(p2.getLastName());
        }
    };

        public static Comparator<Person> name = new Comparator<Person>() {



        @Override
        public int compare(Person p1, Person p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getName().compareTo(p2.getName());
        }
    };

         public static Comparator<Person> birthdate = new Comparator<Person>() {

        @Override
        public int compare(Person p1, Person p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getBirthdate().compareTo(p2.getBirthdate());
        }
    };

             public static Comparator<Person> gender = new Comparator<Person>() {

        @Override

        public int compare(Person p1, Person p2) {

              if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;

            return p1.getGender().compareTo(p2.getGender());
        }
    };
                   public static Comparator<Person> salary = new Comparator<Person>() {

        @Override
        public int compare(Person p1, Person p2) {
             if (p1 == null && p2 == null)
            return 0;
        if (p1 == null)
            return 1;
        if (p2 == null)
            return -1;



            return p1.getSalary().compareTo(p2.getSalary());
        }
    };

                   public void sortBy(Comparator<Person> comparator )
                   {
                       Arrays.sort(mass,comparator);
                   }

}
