package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        City city1 = new City(1, "Bishkek");
        City city2 = new City(2, "Osh");
        City city3 = new City(3, "Batken oblast");
        City city4 = new City(4, "Jalalabad oblast");
        City city5 = new City(5, "Naryn oblast");
        City city6 = new City(6, "Osh oblast");
        City city7 = new City(7, "Talas oblast");
        City city8 = new City(8, "Chuy oblast");
        City city9 = new City(9, "Issikol oblast");

        TreeSet<City> cities = new TreeSet<>();

        addElementToSet(cities, city1);
        addElementToSet(cities, city2);
        addElementToSet(cities, city3);
        addElementToSet(cities, city4);
        addElementToSet(cities, city5);
        addElementToSet(cities, city6);
        addElementToSet(cities, city7);
        addElementToSet(cities, city8);
        addElementToSet(cities, city9);

        System.out.println(cities);
        System.out.println(cities.descendingSet());
    }

    public static void addElementToSet(Set<City> cities, City city){
        if (city.getCode() % 2 == 1){
            cities.add(city);
        }
    }
}
