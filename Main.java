package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            for (Book status : Book.values()) {
                System.out.println("Values[" + status.ordinal() + "]::" + status.name());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error message::" + e.getMessage());
        }









    }
}
