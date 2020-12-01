package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.TV;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class TVUtil {
    private List<TV> tvs;

    public TVUtil(List<TV> tvs) {
        this.tvs = tvs;
    }

    public List<TV> getAll(List<TV> tvs) {
        return tvs;
    }

    public List<Object> getTVWithDiagonal(Integer diagonal) {
        return Arrays.asList(tvs.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .toArray());
    }

    public List<Object> getTVOfProducer(String producer) {
        return Arrays.asList(tvs.stream()
                .filter(tv -> tv.getProducer() == producer)
                .toArray());
    }

    public List<Object> getTVOfACertainYearOfIssue(Integer yearOfIssue) {
        return Arrays.asList(tvs.stream()
                .filter(tv -> tv.getYearOfIssue() > yearOfIssue)
                .toArray());
    }

    public List<Object> getTVOfCertainPrice(Integer fromPrice, Integer toPrice) {
        return Arrays.asList(tvs.stream()
                .filter(tv -> tv.getPrice() > fromPrice && tv.getPrice() < toPrice)
                .toArray());
    }

    public List<Object> getTVOfSortedPriceAscending() {
        return Arrays.asList(tvs.stream()
                .sorted(Comparator.comparingInt(TV::getPrice))
                .toArray());
    }

    public List<Object> getTVOfSortedDiagonalAscending() {
        return Arrays.asList(tvs.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .toArray());
    }

    public List<Object> getTVOfSortedPriceDescending() {
        return Arrays.asList(tvs.stream()
                .sorted(Comparator.comparingInt(TV::getPrice).reversed())
                .toArray());
    }

    public List<Object> getTVOfSortedDiagonalDescending() {
        return Arrays.asList(tvs.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .toArray());
    }
}
