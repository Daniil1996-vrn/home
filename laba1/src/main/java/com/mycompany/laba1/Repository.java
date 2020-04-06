package com.mycompany.laba1;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;

import org.joda.time.format.*;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class Repository is intended for store objects class IPerson.
 *
 *
 * @author Data
 */
@XmlRootElement
public class Repository implements IRepository {

    /**
     * Field size store size massiv.
     */
    private int size;

    @XmlElement(type = Object.class)
    private IPerson[] mass;


    private int count = 0;

    /**
     * This is constructor. In constructor we initialize property size and array
     * mass of type IPerson
     *
     *
     * @author Data
     * @param size
     */
    public Repository(int size) {
        this.size = size;
        mass = new IPerson[size];
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
    public void add(IPerson person) {

        /* if (count == size)
        {
        int currentCapacity = mass.length;
        IPerson[] tempArr = new IPerson[currentCapacity + currentCapacity];
        for(int i = 0; i < mass.length; i++) {
            tempArr[i] = mass[i];
        }
        mass = tempArr;
        }*/
        int firstLength = mass.length;
        for (int i = 0; i < mass.length; i++) {

            if (mass[i] != null && i == mass.length - 1) {
                int currentCapacity = mass.length;
                IPerson[] tempArr = new IPerson[currentCapacity * 2];
                for (int j = 0; j < currentCapacity; j++) {
                    tempArr[j] = mass[j];
                }
                // mass = new IPerson[tempArr.length];
                mass = tempArr;

                //    mass[currentCapacity]=obj;
                //   break;
            }
            if (mass[i] == null) {
                mass[i] = person;
                break;
            }

        }

        //else
    }

    /**
     * Method add -add Object into array mass, if element mass[index] is null.
     *
     */
    public void add(int index, IPerson person) {
        if (mass[index] == null) {
            mass[index] = person;
        } else //throw new Exception("This index contains element");
        {
            Optional.of("This index contains element");
        }
    }

    /**
     * Method set -replace element array "mas" with "index" for object "person".
     *
     * @param index
     * @param person
     */
    public IPerson set(int index, IPerson person) {
        mass[index] = person;
        return person;

    }

    /**
     * Method get -return element array "mass" for given "index".
     *
     */
    public IPerson get(int index) {
        return mass[index];
    }

    /**
     * Method toList -convert array "mass" to Collection "List".
     *
     */
    public List<IPerson> toList() {
        ArrayList<IPerson> arr = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != null) {
                arr.add(mass[i]);
            }
        }
        return arr;
    }

    /**
     * Method delete(int index) receive index element massiv and delete this
     * element.
     *
     * @param index
     */
    public IPerson delete(int index) {

    /*   int size2 = mass.length - 1;
        IPerson[] mass2 = new IPerson[size2];
        System.arraycopy(mass, 0, mass2, 0, index);
        System.arraycopy(mass, index + 1, mass2, index,
                mass.length - index - 1);

        //   count--;
        mass = new IPerson[size2];
        System.arraycopy(mass2, 0, mass, 0, size2);
        mass[index+1]=null;*/

     /*  for (int i = index; i < mass.length-1; i++)
        {
            mass[i] = mass[i + 1];
        }
        int[] newArr = new int[mass.length - 1];
        System.arraycopy(mass, 0, newArr, 0, mass.length - 1);*/

       // return mass[index];

    int   count2 =mass.length-1;

        IPerson oldValue = mass[index];

    int numMoved = count2 - index - 1;
    if (numMoved > 0) {
            System.arraycopy(mass, index+1, mass, index, numMoved);
    }

    mass[--count2] = null;
    return oldValue;

    }

    /**
     * Method getMass - return array "mass"
     *
     */
    public IPerson[] getMass() {

        int countNotNullElement = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != null) {
                countNotNullElement++;
            }
        }

        int currentIndex = 0;

        IPerson[] mass2 = new IPerson[countNotNullElement];
        for (int i = 0; i < mass.length; i++) {

            if (mass[i] != null) {
                mass2[currentIndex++] = mass[i];
            }

        }
        // mass=mass2;

        return mass2;
    }

    /**
     * Method readFromFileInRepository - read file and add to array "mass" with
     * method add(IPerson obj)
     *
     * @param fileName
     */

    /**
     * Method SortBy-sort array "mass" with given comparator
     *
     * @param comparator
     */
    public void sortBy(Comparator<IPerson> comparator) {
        BubbleSorter bs=new BubbleSorter();
        bs.sortby(comparator, mass);
      /*  try {
            bs.bubbleSort(comparator);
        } catch (InstantiationException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        InsertionSorter is=new InsertionSorter();
        is.sortby(comparator, mass);


    }







    public IRepository searchBy(Predicate<IPerson> condition) {
        IRepository buf = new Repository(size);

         IDivision div = new Division("A");
        IDivision div2 = new Division("B");
        IDivision div3 = new Division("C");

        // System.out.println("Hello World");
        LocalDate localDate1 = LocalDate.of(1960, Month.MAY, 14);
        LocalDate localDate2 = LocalDate.of(1965, Month.MAY, 14);
        LocalDate localDate3 = LocalDate.of(1970, Month.MAY, 14);

        BigDecimal bd = new BigDecimal(20000);
        BigDecimal bd2 = new BigDecimal(25000);
        BigDecimal bd3 = new BigDecimal(35000);

        IPerson p1 = new Person(1, "Valeriy", "Petrov",Gender.MALE, localDate1,  div, bd);

        IPerson p2 = new Person(5, "Valeriy", "Petrov",Gender.MALE, localDate1,  div, bd);

        IPerson p3 = new Person(6, "Valeriy", "Petrov",Gender.MALE, localDate1,  div2, bd);
        IPerson p4 = new Person(7, "Valeriy", "Petrov",  Gender.MALE,localDate2, div, bd);
        IPerson p5 = new Person(8, "Valeriy", "Petrov", Gender.MALE,localDate1,  div, bd);
        IPerson p6 = new Person(9, "Vera", "Petrova",Gender.FEMALE, localDate1,  div3, bd2);
        IPerson p7 = new Person(10, "Ivan", "Ivanov", Gender.MALE,localDate3,  div, bd);
        IPerson p8 = new Person(0, "Vladimir", "Smirnov",Gender.MALE, localDate1,  div, bd3);

        buf.add(p1);
        buf.add(p2);
        buf.add(p3);
        buf.add(p4);



        for (int i = 0; i < buf.toList().size(); i++) {
            if (condition.test(mass[i])) {
                return buf;
            }
        }
        return buf;

    }

}
