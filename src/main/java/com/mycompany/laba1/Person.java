/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;





import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import org.joda.time.Period;

/**Class Person contains four field:
 * 1) id as identifikator;
 * 2) Name-Name Father Surname;
 * 3) date - date birthday
 * 4) sex - sex Person
 *
 * Methods getDate(),getSex(),getId(), getName() -returns values fields class
 * Methods setDate(),setSex(),setId(), setName() -set values fields class
 *
 * Method difference_date() -calcute age Person
 * @author Data
 */
 public class Person implements IDivision {
    /**Filed "id" as identifikator.

 */
    private int id;

    /**Filed "Name"-Name Father Surname.

 */
    private String Name;

    private String FirstName;

    private String LastName;

    private LocalDate Birthdate;


     /**Filed date - date birthday.

 */
    private DateTime date;

     /**Filed sex - sex Person.

 */
    private String sex;


    /**Method getDate() return date.
     * @return
 */

    public final DateTime getDate() {
        return date;
    }

    /**Method getSex() return sex.
     * @return
 */
    public final String getSex() {
        return sex;
    }

    /**Method getId() return Id.
     * @return
 */
    public  Integer getId() {
        return id;
    }

     /**Method getName() return Name.
     * @return
 */
    public final String getName() {
        return Name;
    }


     /**Method setDate set field date.
     * @param date
 */
    public final void setDate(DateTime date) {
        this.date = date;
    }

    /**Method setId set field Id.
     * @param id
 */
    public final void setId( Integer id) {
        this.id = id;
    }

    /**Method setName set field Name.
     * @param Name
 */
    public final void setName( String Name) {
        this.Name = Name;
    }

    /**Method setSex set field sex.
     * @param sex
 */
    public final void setSex(final String sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(LocalDate Birthdate) {
        this.Birthdate = Birthdate;
    }





    /**This is constructor.
     * @param id
     * @param Name
     * @param date
     * @param sex
 */
    public  Person(final int id, String Name, DateTime date, String sex) {
        this.id = id;
        this.Name = Name;
        this.date = date;
        this.sex = sex;
    }

    /**Method difference_date() calculate and print age Person.

 */
    public final long differenceDate()
    {

    DateTime now = DateTime.now();


    Period p = new Period(date, now);

    long years = p.getYears();

    return years;

    }

}
