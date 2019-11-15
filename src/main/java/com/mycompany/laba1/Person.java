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
public class Person implements IDivision, IPerson {

    /**
     * Filed "id" as identifikator.
     *
     */
    private int id;

    /**
     * Filed "Name"-Name Father Surname.
     *
     */
    private String Name;

    private String FirstName;

    private String LastName;

    private LocalDate Birthdate;

    /**
     * Filed date - date birthday.
     *
     */


    /**
     * Filed sex - sex Person.
     *
     */


    private Gender Gender;

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
     * Method getName() return Name.
     *
     * @return
     */
    public final String getName() {
        return Name;
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
     * Method setName set field Name.
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Method setSex set field sex.
     *
     * @param sex
     */


    public String getFirstName() {
        return FirstName;
    }

    public String setFirstName(String FirstName) {
        this.FirstName = FirstName;
        return this.FirstName;

    }

    public String getLastName() {
        return LastName;
    }

    public String setLastName(String LastName) {
        this.LastName = LastName;
        return this.LastName;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public LocalDate setBirthdate(LocalDate Birthdate) {
        this.Birthdate = Birthdate;
        return this.Birthdate;
    }

    public BigDecimal getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal Salary) {
        this.Salary = Salary;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

    public IDivision getDivision() {
        return IDivision;
    }

    public void setDivision(IDivision division) {
        this.IDivision = IDivision;
    }

    /**
     * This is constructor.
     *
     * @param id
     * @param Name
     * @param date
     * @param sex
     */
    public Person(int id, String FirstName, String LastName, LocalDate Birthdate, Gender Gender, String Name, BigDecimal Salary) {

        this.id = id;

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Birthdate = Birthdate;

        this.Gender = Gender;
        this.Name = Name;
        this.Salary = Salary;

    }

    /**
     * Method difference_date() calculate and print age Person.
     */
    public Integer getAge() {
        LocalDate now = LocalDate.now();

       //Period p = new Period(date, now);

        int years = (int) ChronoUnit.YEARS.between(Birthdate, now);

        return years;
    }

}
