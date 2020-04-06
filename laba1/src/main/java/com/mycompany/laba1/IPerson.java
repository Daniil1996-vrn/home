/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Data
 */
public interface IPerson {

        public Integer getId();

	public void setId(Integer id);

	public String getFirstName();

	public String setFirstName(String firstName);

	public String getLastName();

	public String setLastName(String firstName);

	public LocalDate getBirthdate();

	public LocalDate setBirthdate(LocalDate birthdate);

	public Integer getAge();

	public Gender getGender();

	public void setGender(Gender gender);

	public IDivision getDivision();

	public void setDivision(IDivision division);

	public BigDecimal getSalary();

	public void setSalary(BigDecimal salary);

}
