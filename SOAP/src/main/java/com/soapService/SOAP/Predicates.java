/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapService.SOAP;

import java.time.LocalDate;
import java.util.function.Predicate;

/**
 *
 * @author Data
 */
public class Predicates {

       /**Predicate for field "id"

     */

      Predicate<IPerson> idField=(IPerson p)->p.getId()>0;

        /**Predicate for field "firstName"

     */
      Predicate<IPerson> firstNameField=(IPerson p)->p.getFirstName().startsWith("Pe");

       /**Predicate for field "lastName"

     */

      Predicate<IPerson> lastNameField=(IPerson p)->p.getFirstName().endsWith("ov");

      /**Predicate for field "Name"

     */
   //   Predicate<IPerson> nameField=(IPerson p)->p.getName().equalsIgnoreCase("A");

      /**Predicate for field "gender"

     */
      Predicate<IPerson> genderField=(IPerson p)->p.getGender()==Gender.MALE;

      /**Predicate for field "birthdate"

     */
      Predicate<IPerson> birthdayField=(IPerson p)->p.getBirthdate().isAfter(LocalDate.parse("1950-11-27"));

      /**Predicate for field "salary"

     */
      Predicate<IPerson> salaryField=(IPerson p)->p.getSalary().equals(20000);

      /**Method searchBy search with gien predicate.

     */

}
