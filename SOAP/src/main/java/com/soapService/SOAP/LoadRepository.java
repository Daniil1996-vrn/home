/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapService.SOAP;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Data
 */
public class LoadRepository {

    private Repository r;
    private int size = 2000;

    public Repository getR() {
        return r;
    }

    public void setR(Repository r) {
        this.r = r;
    }

    public LoadRepository() {
        r = new Repository(size);
    }

    public void readFromFileInRepository(String fileName) throws FileNotFoundException, IOException, Exception {
        // Repository r = new Repository(2000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(fileName);
        BufferedReader fin = new BufferedReader(new FileReader(f));

        String line;
        Scanner in = new Scanner(new File(fileName));

        while (in.hasNextLine()) {

            String buf = in.nextLine();
            if (buf.startsWith("id")) {
                ;
            } else {
                String[] bufArray = buf.split(";");

                int id = Integer.parseInt(bufArray[0]);
                String firstName = bufArray[1];
                String lastName = bufArray[2];
                Gender gender = Gender.valueOf(bufArray[3].toUpperCase());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

                LocalDate date = LocalDate.parse(bufArray[4], formatter);

                String Name = bufArray[5];

                IDivision div = new Division(Name);

                BigDecimal money = new BigDecimal(bufArray[6]);

                IPerson bufObject = new Person(id, firstName, lastName, gender, date, div, money);

                if (bufObject != null) {
                    r.add(bufObject);
                }

            }

        }

    }

    public Stream<IPerson> threeMethod() {
        return r.toList().stream().filter(s -> s.getFirstName().contains("aa"));


    }

    public Stream<IPerson> twoMethod() {
        BigDecimal valDouble = new BigDecimal(5000);
        return r.toList().stream().filter(s -> s.getFirstName().contains("a")).filter(s -> s.getAge() > 30).filter(s -> s.getSalary().compareTo(valDouble) < 0);


    }

    public Map<Integer, Long> fourMethod() {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        List<Integer> list1 = new ArrayList<Integer>();

        set1 = r.toList().stream().map(x -> x.getBirthdate().getYear()).collect(Collectors.toSet());
        list1 = r.toList().stream().map(x -> x.getBirthdate().getYear()).collect(Collectors.toList());

        r.toList().stream().filter(s -> s.getBirthdate().getYear() == s.getBirthdate().getYear()).count();


        Map<Integer, Long> countForYear = list1.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));




        return countForYear;

    }

    public Map<String, BigDecimal> oneMethod() {

        Map<String, BigDecimal> result = r.toList().stream()
                .collect(Collectors.groupingBy(p -> p.getDivision().getName(),
                        Collectors.mapping(IPerson::getSalary, Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))));

       
        return result;

    }
}
