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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

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

    /**
     * In method "Msin" create adnd initialize objects and call methods.
     */
    public static void main(String[] args) throws Exception {
        final int size = 5;
        final int indexGet = 2;
        final int indexDelete = 0;
        final int year = 1965;
        final int month = 7;
        final int day = 22;
        final int unit_time = 0;

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        Person p1 = new Person(1, "Valeriy", "Petrov", localDate1, Gender.MALE, "A", bd);
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(5, "Valeriy", "Petrov", localDate1, Gender.MALE, "D", bd);

        Person p3 = new Person(6, "Valeriy", "Petrov", localDate1, Gender.MALE, "A", bd);
        Person p4 = new Person(7, "Valeriy", "Petrov", localDate2, Gender.MALE, "C", bd);
        Person p5 = new Person(8, "Valeriy", "Petrov", localDate1, Gender.MALE, "A", bd);
        Person p6 = new Person(9, "Petrova", "Vera", localDate1, Gender.FEMALE, "B", bd2);
        Person p7 = new Person(10, "Ivanov", "Ivan", localDate3, Gender.MALE, "A", bd);
        Person p8 = new Person(0, "Smirnov", "Vladimir", localDate1, Gender.MALE, "A", bd3);

        Repository c = new Repository(size);

        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(p5);
        c.add(p6);
        c.add(p7);
        c.add(p8);

        // Comparator c=new Comparator
        //  c.sortBy(Repository.salary);
        // c.sortBy(Repository.id);
        //c.sortBy(Repository.firstName);
        //c.sortBy(Repository.lastName);
        //c.sortBy(Repository.name);
        c.sortBy(Repository.birthdate);
        Person[] mass = c.getMass();

        System.out.println("Sort by IDivision birthdate:");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != null) {
                System.out.println("Id:" + mass[i].getId() + "\n"
                        + "First Name:" + mass[i].getFirstName() + "\n"
                        + "Last Name:" + mass[i].getLastName() + "\n"
                        + "Birthdate:" + mass[i].getBirthdate() + "\n"
                        + "Gender:" + mass[i].getGender() + "\n"
                        + "IDivision Name:" + mass[i].getName() + "\n"
                        + "Salary:" + mass[i].getSalary() + "\n\n");
            }
        }

        System.out.println("Add element for index 8");
        c.add(8, p8);
        System.out.println("Convert Array to List:");

        List<Person> l = c.toList();

        Iterator iterator = l.iterator();

        while (iterator.hasNext()) {
            Person next = (Person) iterator.next();

            System.out.println("Id:" + next.getId() + "\n"
                    + "First Name:" + next.getFirstName() + "\n"
                    + "Last Name:" + next.getLastName() + "\n"
                    + "Birthdate:" + next.getBirthdate() + "\n"
                    + "Gender:" + next.getGender() + "\n"
                    + "IDivision Name:" + next.getName() + "\n"
                    + "Salary:" + next.getSalary() + "\n\n");

        }
        {
            /* System.out.println("Id:"+iterator.next().+"\n"
            +"First Name:"+p.getFirstName()+"\n"
            +"Last Name:"+p.getLastName()+"\n"
            +"Birthdate:"+p.getBirthdate()+"\n"
            +"Gender:"+p.getGender()+"\n"
            +"IDivision Name:"+p.getName()+"\n"
            +"Salary:"+p.getSalary()+"\n\n");*/
            //System.out.println(iterator.next() + "\n");
        }


        /*   System.out.println("Get element for index 5:\n" + c.getelement(5));
        // c.add(0, "Petrov V.V", date, "man");
        // c.add(1, "Petrov V.V", date, "man");

        c.show();
        //  c.deleteElement(1);
        // c.show();

       System.out.println("Result for search:");

       Person[] search = c.searchByParam("1", 1);
      // Person[] search = c.searchByParam("22/7/1970 0:0:0", 3);
      //Person[] search = c.searchByParam("women", 4);

     // Person[] search = c.searchByParam("Petrova V.V", 2);

        for (int i = 0; i < search.length; i++) {
            System.out.println("Id:" + search[i].getId() + "\n" + "Name:" + search[i].getName() + "\n" + "Date:"
                    + search[i].getDate() + "\n" + "Sex:" + search[i].getSex() + "\n");
        }

        System.out.println("Sort by bubble:");

        Person[] bubblesort = c.bubbleSort(1);

        for (int i = 0; i < bubblesort.length; i++) {
            System.out.println("Id:" + bubblesort[i].getId() + "\n" + "Name:" + bubblesort[i].getName() + "\n"
                    + "Date:" + bubblesort[i].getDate() + "\n" + "Sex:" + bubblesort[i].getSex() + "\n");
        }

        System.out.println("Sort by insertion:");

        Person[] insertionsort = c.insertionSort(3);

        for (int i = 0; i < insertionsort.length; i++) {
            System.out.println("Id:" + insertionsort[i].getId() + "\n" + "Name:" + insertionsort[i].getName() + "\n"
                    + "Date:" + insertionsort[i].getDate() + "\n" + "Sex:" + insertionsort[i].getSex() + "\n");
        }*/
        Repository c2 = new Repository(500);
        Person[] readFromFile = c2.readFromFileInRepository("C:\\Users\\Data\\Documents\\NetBeansProjects\\laba1\\src\\main\\resources\\persons.csv");
        System.out.println(readFromFile.length);
        for (int i = 0; i < readFromFile.length; i++) {
            System.out.println(
                    "Id:" + readFromFile[i].getId() + "\n"
                    + "First name:" + readFromFile[i].getFirstName() + "\n"
                    + "Last name:" + readFromFile[i].getLastName() + "\n"
                    + "Gender:" + readFromFile[i].getGender() + "\n"
                    + "Birthdate:" + readFromFile[i].getBirthdate() + "\n"
                    + "Division:" + readFromFile[i].getName() + "\n"
                    + "Salary:" + readFromFile[i].getSalary() + "\n\n"
            );

        }
        //  c2.readFromFileInRepository("C:\\Users\\Data\\Documents\\NetBeansProjects\\laba1\\src\\main\\resources\\persons.csv");

        /*c.getelement(c.create_and_initialize(), indexGet);
       c.delete_element(indexDelete);*/
    }
}
