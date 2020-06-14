package com.company;

import java.util.Scanner;

public class PrintPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        //Number of rows added by user
        int noOfRows = sc.nextInt();

        //Initializing rowCount with 1
        int rowCount = 1;

        if (noOfRows == 0) {
            System.out.println("Pyramid with 0 raws can't be created.");
        } else {
            System.out.println("Here is your pyramid");
            //Implementing the logic
            for (int i = noOfRows; i > 0; i--) {

                //Printing i spaces at the beginning of each row
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }

                //Printing * at the end of each row
                for (int j = 1; j <= rowCount; j++) {
                    System.out.print("* ");
                }

                System.out.println();

                //Incrementing the rowCount
                rowCount++;

            }
        }


    }
}
