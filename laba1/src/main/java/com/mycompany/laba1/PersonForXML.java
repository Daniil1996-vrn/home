package com.mycompany.laba1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;


@XmlAccessorType(XmlAccessType.FIELD)
public class PersonForXML {

    private Integer Id;
    private String FirstName;
    private String LastName;

    @XmlJavaTypeAdapter( LocalDateAdapter.class )
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

    public com.mycompany.laba1.Gender getGender() {
        return Gender;
    }

    public void setGender(com.mycompany.laba1.Gender gender) {
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public PersonForXML(Integer id, String firstName, String lastName, LocalDate birthdate, Integer age, com.mycompany.laba1.Gender gender, String name, BigDecimal salary) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Birthdate = birthdate;
        Age = age;
        Gender = gender;
        Name = name;
        Salary = salary;
    }

    public PersonForXML()
    {

    }


}
