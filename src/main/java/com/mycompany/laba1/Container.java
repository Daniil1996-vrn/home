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
 * Method add - add object type Person in array mass of type Person
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

   private  Person [] mass;

   private int count = 0;

    /**This is constructor.
     * In constructor we initialize property size and array mass of type Person

 *
 * @author Data
     * @param size
 */
    public Container( int size) {
        this.size = size;
        mass=new Person[size];
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

     /**Method setMass set array mass of type Person .
     * @return
 */
    public void setMass(Person[] mass) {
        this.mass = mass;
    }

     /**Method getMass() get array mass of type Person .
     * @return
 */
    public Person[] getMass() {
        return mass;
    }








    public  void add( Person obj) throws Exception
    {

        if (count == size)
            throw new Exception("capacity exceeded");
          mass[count++] = obj;


    }

    /**Method show() show elements array mass of type Person

 */
    public final void show()
    {
        System.out.println("Show elements massiv:");
        for (int i = 0; i < count; i++) {
        Person el = mass[i];
        System.out.println("Id:" + el.getId() + "\n" + "NFS:"
                + el.getNFS() + "\n" + "Date:" + el.getDate() + "\n" + "Sex:" + el.getSex() + "\n");
  }
    }

    /**Method getelement(Person [] mass2,int index) receive argument
     * as  massiv objects of  class Person and index element
     * massiv and show element massiv.
     * @param index
 */
    public final void getelement(final int index)
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
    public final void deleteElement(int index)
    {

        int size2 = mass.length - 1;
        Person[] mass2 = new Person[size2];
        System.arraycopy(mass, 0, mass2, 0, index);
        System.arraycopy(mass, index + 1, mass2, index,
                mass.length - index - 1);
        System.out.println("Massiv without element with index:" + index);
        count--;
        mass = new Person[size2];
        System.arraycopy(mass2, 0, mass, 0, size2); 



    }
}
