package com.rakovets.course.javabasics.practice.exceptionhandling;

//Task 5

public class Print {
    private String str;

    public Print(String str) {
        this.str = str;
    }

    public class NoDataException extends Exception {
        public NoDataException(String message) {
            super(message);
        }
    }

    public void printException() throws NoDataException {
        System.out.println("Data entry pending...");
        try {
            if (str == null) {
                throw new NoDataException("Enter the data.");
            }
            System.out.println(str);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            throw new NoDataException(e.getMessage());
        }
    }

}






