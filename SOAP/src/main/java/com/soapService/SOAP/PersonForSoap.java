package com.soapService.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonForSoap", propOrder = {
        "Id",
        "FirstName",
         "LastName",
         "Birthdate",
         "Age",

         "Gender",
         "Name",
         "Salary"

})
public class PersonForSoap {
    @XmlElement(required = true)
    private Integer Id;

    private String FirstName;
    private String LastName;
    private LocalDate Birthdate;
    private Integer Age;

    private Gender Gender;
    private String Name;
    private BigDecimal Salary;

    public BigDecimal getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal salary) {
        Salary = salary;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        Birthdate = birthdate;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender gender) {
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }




    public PersonForSoap(Integer id, String firstName, String lastName, LocalDate birthdate, Integer age, Gender gender, String name, BigDecimal salary) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Birthdate = birthdate;
        Age = age;
        Gender = gender;
        Name = name;
        Salary = salary;
    }

    public PersonForSoap()
    {

    }
}
