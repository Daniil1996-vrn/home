/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba1;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
/**
 *
 * @author Data
 */
public interface IRepository {

    public void add(Person person);

	public Person get(int index);

	public Person[] delete(int index);

	public Person set(int index, Person person);

	public void add(int index, Person person);

	public List<Person> toList();

	//Should not use toList method
	public void sortBy(Comparator<Person> comparator );

	//Should not use toList method
	public IRepository searchBy(Predicate<Person> condition);

}
