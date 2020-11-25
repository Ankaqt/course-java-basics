package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker implements Runnable {
    private boolean isActive = true;
    private CommonResource commonResource;

    public MasterWorker(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int nextInt = 0;
        try {
            while (isActive) {
                System.out.println("Input a number");
                nextInt = scanner.nextInt();
                if (nextInt == -1) {
                    isActive = false;
                } else {
                    commonResource.deque.addLast(nextInt);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You entered incorrect data");
        }
    }
}
