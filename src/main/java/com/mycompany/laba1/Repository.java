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
 * Class Repository is intended for store objects class IPerson.
 *
 *
 * @author Data
 */
public class Repository implements IRepository {

    /**
     * Field size store size massiv.
     */
    private int size;

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
    public void add(IPerson person)  {

        /* if (count == size)
        {
        int currentCapacity = mass.length;
        IPerson[] tempArr = new IPerson[currentCapacity + currentCapacity];
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
        IPerson[] tempArr = new IPerson[currentCapacity*2];
        for(int j = 0; j < currentCapacity; j++) {
            tempArr[j] = mass[j];
        }
       // mass = new IPerson[tempArr.length];
      mass=tempArr;

    //    mass[currentCapacity]=obj;
     //   break;
               }
              if (mass[i] == null ) {
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

    public void  add(int index, IPerson person)
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
    public IPerson  set(int index, IPerson person)
    {
         mass[index]=person;
         return person;

    }
/**
     * Method get -return element array "mass" for given "index".
     *
     */
    public IPerson get(int index)
    {
        return mass[index];
    }

    /**
     * Method toList -convert array "mass" to Collection "List".
     *
     */


    public List<IPerson> toList() {
        ArrayList<IPerson> arr = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]!=null)
            arr.add(mass[i]);
        }
        return arr;
    }


    /**
     * Method delete(int index) receive index element massiv and delete
     * this element.
     *
     * @param index
     */
    public  IPerson delete(int index) {

        int size2 = mass.length - 1;
        IPerson[] mass2 = new IPerson[size2];
        System.arraycopy(mass, 0, mass2, 0, index);
        System.arraycopy(mass, index + 1, mass2, index,
                mass.length - index - 1);
        System.out.println("Massiv without element with index:" + index);
        //   count--;
        mass = new IPerson[size2];
        System.arraycopy(mass2, 0, mass, 0, size2);
        return mass[index];

    }

    /**
     * Method getMass - return array "mass"

     */

    public IPerson[] getMass() {

        int countNotNullElement=0;

        for(int i=0;i<mass.length;i++)
        {
            if(mass[i]!=null) countNotNullElement++;
        }

        int currentIndex=0;

        IPerson[] mass2=new IPerson[countNotNullElement];
        for(int i=0;i<mass.length;i++)
        {

             if(mass[i]!=null) mass2[currentIndex++]=mass[i];





        }
       // mass=mass2;

        return mass2;
    }
/**
     * Method readFromFileInRepository - read file and add to array "mass" with method add(IPerson obj)
     * @param fileName
     */




                    /**Method SortBy-sort array "mass" with given comparator
     * @param comparator
     */

                   public void sortBy(Comparator<IPerson> comparator )
                   {
                       Arrays.sort(mass,comparator);

                   }



public IRepository searchBy(Predicate<IPerson> condition)
{
    IRepository buf=null;
   for(int i=0;i<mass.length;i++)
   {
       if(condition.test(mass[i]))  buf=(IRepository) this;
   }
    return buf;

}

}