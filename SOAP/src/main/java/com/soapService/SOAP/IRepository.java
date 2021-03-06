/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapService.SOAP;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Data
 */
public interface IRepository {

   public void add(IPerson person);

	public IPerson get(int index);

	public IPerson delete(int index);

	public IPerson set(int index, IPerson person);

	public void add(int index, IPerson person);

	public List<IPerson> toList();

	//Should not use toList method
	public void sortBy(Comparator<IPerson> comparator);

	//Should not use toList method
	public IRepository searchBy(Predicate<IPerson> condition);
}
