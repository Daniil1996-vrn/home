/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.time.format.DateTimeFormatter;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import sun.security.util.Length;

/**
 * Class Container is intended for store objects class Person. Field Size
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
public class Container<T> {

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
    public Container(int size) {
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
        Person[] tempArr = new Person[currentCapacity + 1];
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
            System.out.println("Id:" + el.getId() + "\n" + "NFS:"
                    + el.getNFS() + "\n" + "Date:" + el.getDate() + "\n" + "Sex:" + el.getSex() + "\n");
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
                + "NFS:" + mass[index].getNFS() + "\n"
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

    public Person[] searchByParam(String value, int numberParam) throws Exception {
        Person[] search = new Person[mass.length];

        switch (numberParam) {
            case 1: {
                for (int i = 0; i < mass.length; i++) {
                    int buf = Integer.parseInt(value);
                    if (mass[i].getId() == buf) {
                        search[i] = mass[i];

                    } else {
                        throw new Exception("not found");
                        //System.out.println( mass[i].getId());

                    }

                }

            }
            break;
            case 2: {
                for (int i = 0; i < mass.length; i++) {

                    if (mass[i].getNFS() == value) {
                        search[i] = mass[i];

                    } /*else {
                        throw new Exception("not found");
                        //System.out.println( mass[i].getId());

                    }*/

                }
                if(search.length==0)  throw new Exception("not found");
            }

            break;

            case 3: {
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

                    /*Period p2 = new Period(mass[i].getDate());
                     long year2 = p2.getYears();
                      long month2=p2.getMonths();
                      long day2=p2.getDays();
                      long hour2=p2.getHours();
                      long minutes2=p2.getMinutes();
                      long seconds2=p2.getSeconds();*/
                    //if (year==year2 && month==month2 && day==day2 && hour==hour2 && minutes==minutes2 && seconds==seconds2)
                    if (mass[i].getDate().isEqual(date)) {
                        search[i] = mass[i];

                    } else {
                        throw new Exception("not found");
                        //System.out.println( mass[i].getId());

                    }

                }
            }
            break;

            case 4: {
                for (int i = 0; i < mass.length; i++) {

                    if(mass[i]==null) ;
                    else
                    {
                    if (mass[i].getSex() == value ) {
                        search[i] = mass[i];

                    } else {
                        throw new Exception("not found");
                        //System.out.println( mass[i].getId());

                    }
                    }

                }
            }
            break;

        }
        return search;

    }

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
                        if (mass[j - 1].getDate().isBefore(mass[j].getDate())) {
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
                    while (item >= 0 && mass[item].getDate().isBefore(temp.getDate())) {
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

}
