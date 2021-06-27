package day11loops;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		/*
		 	Create the following image by getting the number of rows from user
		 				 .
		                 .

		                 *
		                * *
		               * * *
		              * * * *
	    */
		System.out.println("Enter the length of the base...");
		int x = scanner.nextInt();
		int count = 0;

		// This is the number of rows
		// len is the number entered by the user
		// We will run this outer loop  len number of times.
		for(int i=0; i<x; i++) {

		// First we will need to give space x-i times because i also represents the number of stars as the number of stars increase the number of
		// spaces decrease proportionally
		// This is the number of spaces
			for(int j=0; j<x-i; j++) {
				System.out.print(" ");
			}
		// This is the number of stars
		// We need this loop here to be able to print len number of asterisks in the same line

			for(int k=0; k<i; k++) {
				System.out.print("* ");
				count +=1;

			}

			//this will run x times to print stars into next line
			System.out.println();			
		}
		System.out.println("\n Total Number Of Stars : " + count);

	}

}
