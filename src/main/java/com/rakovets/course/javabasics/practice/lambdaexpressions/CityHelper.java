package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class CityHelper {

    public static List<String> getAllCities(List<String> cities) {
        return cities;
    }

    public static List<Object> getUniqueCities(List<String> cities) {
        return Arrays.asList(cities.stream()
                .distinct()
                .toArray());
    }

    public static List<Object> getCitiesWithSpecificName(List<String> cities) {
        return Arrays.asList(cities.stream()
                .filter(city -> city.length() > 6)
                .toArray());
    }

    public static List<Object> getCitiesStartingWithLetter(List<String> cities, char letter) {
        return Arrays.asList(cities.stream()
                .filter(city -> city.charAt(0) == letter)
                .toArray());
    }

    public static long getAmountOfCity(List<String> cities, String str) {
        return cities.stream()
                .filter(city -> str.equals(city))
                .count();
    }
}


