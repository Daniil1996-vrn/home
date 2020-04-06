/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.joda.time.Period;

/**
 * Class Person contains four field: 1) id as identifikator; 2) Name-Name Father
 * Surname; 3) date - date birthday 4) sex - sex Person
 *
 * Methods getDate(),getSex(),getId(), getName() -returns values fields class
 * Methods setDate(),setSex(),setId(), setName() -set values fields class
 *
 * Method difference_date() -calcute age Person
 *
 * @author Data
 */
public class Person implements IPerson {

    /**
     * Filed "id" as identifikator.
     *
     */
    private int id;

    /**
     * Filed "Name"-Name Father Surname.
     *
     */


    private String FirstName;

    private String LastName;

    private LocalDate Birthdate;

    /**
     * Filed date - date birthday.
     *
     */


    /**
     * Filed Gender - sex Person.
     *
     */


    private Gender Gender;

    /**
     * Filed Salary - Salary for Person.
     *
     */

    private BigDecimal Salary;

    public IDivision IDivision;





    /**
     * Method getId() return Id.
     *
     * @return
     */
    public Integer getId() {
        return id;
    }



    /**
     * Method setId set field Id.
     *
     * @param id
     */
    public final void setId(Integer id) {
        this.id = id;
    }




 /**
     * Method getFirstName return filedt FirstName.
     *

     */

    public String getFirstName() {
        return FirstName;
    }

    /**
     * Method getFirstName set filed FirstName.
     *
     * @param FirstName
     */

    public String setFirstName(String FirstName) {
        this.FirstName = FirstName;
        return this.FirstName;

    }

    /**
     * Method getlastName return filed LastName.
     *

     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Method setLastName set filed LastName.
     *
     * @param FirstName
     */
    public String setLastName(String LastName) {
        this.LastName = LastName;
        return this.LastName;
    }
/**
     * Method getBirthdate return filed Birthdate.
     *

     */
    public LocalDate getBirthdate() {
        return Birthdate;
    }

     /**
     * Method setBirthdate set filed Birthdate.
     *
     * @param Birthdate

     */
    public LocalDate setBirthdate(LocalDate Birthdate) {
        this.Birthdate = Birthdate;
        return this.Birthdate;
    }

    /**
     * Method getSalary return filed Salary.
     *

     */
    public BigDecimal getSalary() {
        return Salary;
    }

    /**
     * Method setSalary set filed Salary.
     *
     * @param Salary
     */
    public void setSalary(BigDecimal Salary) {
        this.Salary = Salary;
    }

     /**
     * Method getGender return  gender Person.
     *

     */
    public Gender getGender() {
        return Gender;
    }

     /**
     * Method setGender set gender Person.
     *
     * @param Gender
     */
    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

    /**
     * Method getDivision return gender Person.
     *
     */
    public IDivision getDivision() {
        return IDivision;
    }


    /**
     * Method getDivision return field setDivision.
     *
     * @param division
     */
    public void setDivision(IDivision division) {
        this.IDivision = IDivision;
    }

    /**
     * This is constructor.
     *
     * @param id
     * @param FirstName
     * @param Name
     * @param Birthdate
     * @param Gender
     * @param Salary
     *
     */
    public Person(int id, String FirstName, String LastName, Gender Gender,LocalDate Birthdate,  String Name, BigDecimal Salary) {

        this.id = id;

        this.FirstName = FirstName;
        this.LastName = LastName;
         this.Gender = Gender;
        this.Birthdate = Birthdate;


        this.IDivision.setName(Name);
        this.Salary = Salary;

    }

    public Person(int id, String FirstName, String LastName,Gender Gender, LocalDate Birthdate, IDivision IDivision, BigDecimal Salary ) {
        this.id = id;

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.Birthdate = Birthdate;
        this.IDivision = IDivision;
        this.Salary = Salary;

    }



    /**
     * Method getAge calculate and print age Person.
     */
    public Integer getAge() {
        LocalDate now = LocalDate.now();

       //Period p = new Period(date, now);

        int years = (int) ChronoUnit.YEARS.between(Birthdate, now);

        return years;
    }

}
