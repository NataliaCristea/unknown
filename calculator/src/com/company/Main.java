package com.company;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final byte MONTHS_IN_YEAR= 12;
	final byte PERCENT= 100;

	Scanner scanner= new Scanner(System.in);
        System.out.println("Principal: ");
        int pricipal = scanner.nextInt();

        System.out.println("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
                float mothlyInterest= annualInterest/PERCENT/MONTHS_IN_YEAR;
        System.out.println("Period (years): ");
        byte years= scanner.nextByte();
        int numberOfPayments= years* MONTHS_IN_YEAR;

        double mortgage= pricipal *(mothlyInterest * Math.pow(1+ mothlyInterest, numberOfPayments -1)/ (Math.pow(1+ mothlyInterest, numberOfPayments -1)));
       String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
}
