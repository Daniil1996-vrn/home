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
import java.util.function.Predicate;
import java.util.Optional;
/**
 * Class Repository is intended for store objects class Person.
 *
 *
 * @author Data
 */
public class Repository implements IRepository {

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

 /**
     * Method add -add Object into array mass.
     *
     */
    public void add(Person obj)  {

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

    /**
     * Method add -add Object into array mass, if element mass[index] is null.
     *
     */

    public void  add(int index, Person person)
    {
        if(mass[index]==null) mass[index]=person;
        else
        //throw new Exception("This index contains element");
        Optional.of("This index contains element");
    }
 /**
     * Method set -replace element array "mas" with "index" for object "person".
     *
     * @param index
     * @param person
     */
    public Person  set(int index, Person person)
    {
         mass[index]=person;
         return person;

    }
/**
     * Method get -return element array "mass" for given "index".
     *
     */
    public Person get(int index)
    {
        return mass[index];
    }

    /**
     * Method toList -convert array "mass" to Collection "List".
     *
     */

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
     * Method delete(int index) receive index element massiv and delete
     * this element.
     *
     * @param index
     */
    public  Person[] delete(int index) {

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

    /**
     * Method getMass - return array "mass"

     */

    public Person[] getMass() {
        return mass;
    }
/**
     * Method readFromFileInRepository - read file and add to array "mass" with method add(Person obj)
     * @param fileName
     */

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

    /**
     * Comparator for filed "id".

     */

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

      /**
     * Comparator for filed "firstName".

     */
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

      /**
     * Comparator for filed "lastName".

     */

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

        /**
     * Comparator for filed "name".

     */
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
/**
     * Comparator for filed "birthdate".

     */
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
        /**
     * Comparator for filed "gender".

     */

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
             /**
     * Comparator for filed "salary".

     */
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
                    /**Method SortBy-sort array "mass" with given comparator

     */

                   public void sortBy(Comparator<Person> comparator )
                   {
                       Arrays.sort(mass,comparator);

                   }


                    /**Predicate for field "id"

     */

      Predicate<Person> idField=(Person p)->p.getId()>0;

        /**Predicate for field "firstName"

     */
      Predicate<Person> firstNameField=(Person p)->p.getFirstName().startsWith("Pe");

       /**Predicate for field "lastName"

     */

      Predicate<Person> lastNameField=(Person p)->p.getFirstName().endsWith("ov");

      /**Predicate for field "Name"

     */
      Predicate<Person> nameField=(Person p)->p.getName().equalsIgnoreCase("A");

      /**Predicate for field "gender"

     */
      Predicate<Person> genderField=(Person p)->p.getGender()==Gender.MALE;

      /**Predicate for field "birthdate"

     */
      Predicate<Person> birthdayField=(Person p)->p.getBirthdate().isAfter(LocalDate.parse("1950-11-27"));

      /**Predicate for field "salary"

     */
      Predicate<Person> salaryField=(Person p)->p.getSalary().equals(20000);

      /**Method searchBy search with gien predicate.

     */
public IRepository searchBy(Predicate<Person> condition)
{
    return (IRepository) condition;
}
}