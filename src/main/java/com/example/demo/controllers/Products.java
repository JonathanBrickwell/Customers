package com.example.demo.controllers;

import com.example.demo.models.Customers;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Products {

    @GetMapping("/products")
    public Set<String> justProducts() {
        Set<String> products = new HashSet<>();

        products.add("Customers #1");
        products.add("Customers #2");
        products.add("Customers #3");

        return products;
    }

    @GetMapping("/products-2")
    public Set<Integer> anotherProducts() {

        List<Integer> numberDivisbleBy5 = new ArrayList<>();
        numberDivisbleBy5.add(5);
        numberDivisbleBy5.add(10);
        numberDivisbleBy5.add(20);

        List<Integer> numberDivisbleBy3 = new ArrayList<>();
        numberDivisbleBy5.add(3);
        numberDivisbleBy5.add(9);
        numberDivisbleBy5.add(18);

        Set<Integer> numberDivisibleby5or3 = new HashSet<>(numberDivisbleBy5);

        numberDivisibleby5or3.addAll(numberDivisbleBy3);

        //this.SearchCities();
        //this.DeleteTheCities();
        this.IteratingOverCities();

        return numberDivisibleby5or3;
    }

    @GetMapping("/customers")
    public Set<Customers> getCustomers() {

        Set<Customers> customersSet = new HashSet<>();
        customersSet.add(new Customers(1, "Anthony"));
        customersSet.add(new Customers(2, "Josh"));
        customersSet.add(new Customers(3, "Elon"));

        customersSet.add(new Customers(1, "Anthony"));

        return customersSet;

    }

    public void SearchCities() {

        Set<String> popularCities = new HashSet<>();

        //Check if it's empty.
        System.out.println("Is popularCities set as an empty array? " + popularCities.isEmpty());

        popularCities.add("New York");
        popularCities.add("Zagreb");
        popularCities.add("New Yersey");

        System.out.println("Number of cities in the HashSet: " + popularCities.size());

        String city = "Varazdin";
        if(popularCities.contains(city)) {
            System.out.println(city + " is in the popular cities set.");
        } else {
            System.out.println(city + " is not in the popular cities set.");
        }
    }

    public void DeleteTheCities() {

        Set<Integer> theNumbers = new HashSet<>();
        boolean isRemoved;

        theNumbers.add(1);
        theNumbers.add(2);
        theNumbers.add(3);
        theNumbers.add(4);
        theNumbers.add(5);
        theNumbers.add(6);
        theNumbers.add(7);
        theNumbers.add(8);

        System.out.println("Ovo su originalni brojevi: " + theNumbers);

        isRemoved = theNumbers.remove(8);
        System.out.println("After removing the number 8: " + theNumbers);

        List<Integer> perfectSquares = new ArrayList<>();
        perfectSquares.add(4);
        perfectSquares.add(2);

        theNumbers.removeAll(perfectSquares);
        System.out.println("After removing perfectSquares: " + theNumbers);

        theNumbers.removeIf(num -> num % 2 == 0);
        System.out.println("After selective deletion: " + theNumbers);

        theNumbers.clear();
        System.out.println("After deleting the whole HashSet: " + theNumbers);

    }

    public void IteratingOverCities() {

        Set<String> programmingLanguages = new HashSet<>();

        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C#");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");

        /*System.out.println("Java 8 forEach and lambda iteration: ");
        programmingLanguages.forEach(programmingLanguage -> {
            System.out.println(programmingLanguage);
        });*/

        System.out.println("Iterating over a HashSet using iterator() ");
        Iterator<String> programmingLanguagesIterator = programmingLanguages.iterator();
        while(programmingLanguagesIterator.hasNext()) {
            String programmingLanguage = programmingLanguagesIterator.next();
            System.out.println("Ovo je jezik: " + programmingLanguage);
        }

        System.out.println("****************************");

        System.out.println("Simple for-each loop");
        for(String programmingLanguage: programmingLanguages) {
            System.out.println("Ovo su jezici: " + programmingLanguage);
        }

    }
}
