/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;





import org.joda.time.DateTime;

import org.joda.time.Period;

/**Class Person contains four field:
 * 1) id as identifikator;
 * 2) NFS-Name Father Surname;
 * 3) date - date birthday
 * 4) sex - sex Person
 *
 * Methods getDate(),getSex(),getId(), getNFS() -returns values fields class
 * Methods setDate(),setSex(),setId(), setNFS() -set values fields class
 *
 * Method difference_date() -calcute age Person
 * @author Data
 */
public class Person {
    /**Filed "id" as identifikator.

 */
    private int id;

    /**Filed "NFS"-Name Father Surname.

 */
    private String NFS;


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
    public final int getId() {
        return id;
    }

     /**Method getNFS() return NFS.
     * @return
 */
    public final String getNFS() {
        return NFS;
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
    public final void setId(final int id) {
        this.id = id;
    }

    /**Method setNFS set field NFS.
     * @param NFS
 */
    public final void setNFS(final String NFS) {
        this.NFS = NFS;
    }

    /**Method setSex set field sex.
     * @param sex
 */
    public final void setSex(final String sex) {
        this.sex = sex;
    }

    /**This is constructor.
     * @param id
     * @param NFS
     * @param date
     * @param sex
 */
    public  Person(final int id, String NFS, DateTime date, String sex) {
        this.id = id;
        this.NFS = NFS;
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
