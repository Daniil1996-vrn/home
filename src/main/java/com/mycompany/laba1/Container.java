/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import org.joda.time.DateTime;

/**
 * Class Container  is intended for store objects class Person.
 * Field Size -describe size massiv which store objects class Person
 * Method getSize - return field size
 * Method setSize - set field size
 * Method create_and_initialize() create and initialize
 * for store objects class Person
 * Method show(Person [] mass2) receive argument as  massiv objects
 * of  class Person and show it elements
 * Method getelement(Person [] mass2,int index) receive argument
 * as  massiv objects of  class Person and index element massiv
 * and show element massiv
 * Method delete_element(int index) receive
 * index element massiv and delete this element

 *
 * @author Data
 */
public class Container {

    /**Field size store size massiv.
 */
    private int size;

   private  Person [] mass = new Person[size];

    /**This is constructor.

 *
 * @author Data
     * @param size
 */
    public Container( int size) {
        this.size = size;
    }

     /**Method setSize set size.
     * @param size
 */
    public final void setSize(int size) {
        this.size = size;
    }

    /**Method getSize return size.
     * @return
 */
    public  final int getSize() {
        return size;
    }

    public void setMass(Person[] mass) {
        this.mass = mass;
    }

    public Person[] getMass() {
        return mass;
    }








    public  void add( Person obj)
    {


     //  DateTime   date = new DateTime(1965, 7, 22, 0, 0, 0, 0);

       // Person p2 = new Person(1, "Petrov V.V", date, "man");
        for (int i = 0; i < mass.length; i++)

        {
           if( mass[i]==null)
           {
               mass[i]=obj;
               break;
           }
           //new Person(i, "Petrov", date, "man");
        }


    }

    /**Method show(Person [] mass2) receive argument as
     * massiv objects of  class Person and show it elements.
     * @param mass2
 */
    public final void show()
    {
        System.out.println("Show elements massiv:");
        for(Person el:  mass) {
            System.out.println("Id:" + el.getId() + "\n" + "NFS:" + el.getNFS() + "\n" + "Date:" + el.getDate() + "\n" + "Sex:" + el.getSex() + "\n");
        }
    }

    /**Method getelement(Person [] mass2,int index) receive argument
     * as  massiv objects of  class Person and index element massiv and show element massiv.
     * @param mass2
     * @param index
 */
    public final void getelement(int index)
    {

        System.out.println("Get element for index:" + index);
            System.out.println("Id:" + mass[index].getId() + "\n"+
                    "NFS:" + mass[index].getNFS() + "\n" +
                    "Date:" + mass[index].getDate()+ "\n" + "Sex:" +
                    mass[index].getSex() + "\n");

    }
/**Method delete_element(int index) receive
 * index element massiv and delete this element.
     * @param index
 */
    public final void delete_element(int index)
    {

        Person[] mass2 = new Person[mass.length - 1];
        System.arraycopy(mass, 0, mass2, 0, index);
        System.arraycopy(mass, index + 1, mass2, index,
                mass.length - index - 1);
        System.out.println("Massiv without element with index:" + index);
       // show(mass2);
    }
}
