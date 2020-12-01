package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = List.of("Minsk", "Brest", "Polotsk", "Orsha", "Minsk", "Brest", "Polotsk");
        System.out.println("All cities: " + CityHelper.getAllCities(cities));
        System.out.println("Unique cities: " + CityHelper.getUniqueCities(cities));
        System.out.println("Cities with specific name: " + CityHelper.getCitiesWithSpecificName(cities));
        System.out.println("Cities starting with certain letter: " + CityHelper.getCitiesStartingWithLetter(cities, 'M'));
        System.out.println("Amount of certain city: " + CityHelper.getAmountOfCity(cities, "Minsk"));
    }
}
