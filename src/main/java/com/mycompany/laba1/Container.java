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


    /**This is constructor.

 *
 * @author Data
     * @param size
 */
    public Container(final int size) {
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


 /**Method create_and_initialize() create and initialize
  * for store objects class Person.
     * @return
 */
    public final Person[] create_and_initialize()
    {
        int len = getSize();
        Person[] mass = new Person[size];
        DateTime   date = new DateTime(1965, 7, 22, 0, 0, 0, 0);
        for (int i = 0; i < len; i++)

        {
            mass[i] = new Person(i, "Petrov", date, "man");
        }
        return mass;
    }

    /**Method show(Person [] mass2) receive argument as
     * massiv objects of  class Person and show it elements.
     * @param mass2
 */
    public final void show(Person [] mass2)
    {
        System.out.println("Show elements massiv:");
        for(Person mass21 : mass2) {
            System.out.println("Id:" + mass21.getId() + "\n" + "NFS:" + mass21.getNFS() + "\n" + "Date:" + mass21.getDate() + "\n" + "Sex:" + mass21.getSex() + "\n");
        }
    }

    /**Method getelement(Person [] mass2,int index) receive argument
     * as  massiv objects of  class Person and index element massiv and show element massiv.
     * @param mass2
     * @param index
 */
    public final void getelement(Person [] mass2,int index)
    {

        System.out.println("Get element for index:" + index);
            System.out.println("Id:" + mass2[index].getId() + "\n"+
                    "NFS:" + mass2[index].getNFS() + "\n" +
                    "Date:" + mass2[index].getDate()+ "\n" + "Sex:" +
                    mass2[index].getSex() + "\n");

    }
/**Method delete_element(int index) receive
 * index element massiv and delete this element.
     * @param index
 */
    public final void delete_element(int index)
    {
        Person[] mass2 = create_and_initialize();
        Person[] mass3 = new Person[create_and_initialize().length - 1];
        System.arraycopy(mass2, 0, mass3, 0, index);
        System.arraycopy(mass2, index + 1, mass3, index,
                mass2.length - index - 1);
        System.out.println("Massiv without element with index:" + index);
        show(mass3);
    }
}
