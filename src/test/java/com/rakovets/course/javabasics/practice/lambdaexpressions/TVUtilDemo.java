package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.TV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TVUtilDemo {
    public static void main(String[] args) {
        List<TV> tvs = new ArrayList<TV>();
        tvs.add(new TV("Samsung", "UE50RU7170U", 2020, 43, 30599));
        tvs.add(new TV("LG", "49UM7300", 2020, 50, 33990));
        tvs.add(new TV("Philips", "50PUS6704", 2020, 50, 29198));

        TVUtil tvUtil = new TVUtil(tvs);
        int diagonal = 50;
        String producer = "Samsung";
        int yearOfIssue = 2019;
        int fromPrice = 29000;
        int toPrice = 31000;

        System.out.println("TVs with diagonal " + diagonal + ": " + tvUtil.getTVWithDiagonal(diagonal));
        System.out.println("TVs of producer " + producer + ": " + tvUtil.getTVOfProducer(producer));
        System.out.println("TVs with year of issue " + yearOfIssue + ": " + tvUtil.getTVOfACertainYearOfIssue(yearOfIssue));
        System.out.println("TVs in the price range from " + fromPrice + " to " + toPrice + ": " + tvUtil.getTVOfCertainPrice(fromPrice, toPrice));
        System.out.println("TVs sorted by price (ascending) " + tvUtil.getTVOfSortedPriceAscending());
        System.out.println("TVs sorted by price (descending) " + tvUtil.getTVOfSortedPriceDescending());
        System.out.println("TVs sorted by diagonal (ascending) " + tvUtil.getTVOfSortedDiagonalAscending());
        System.out.println("TVs sorted by diagonal (descending) " + tvUtil.getTVOfSortedDiagonalDescending());
    }
}

