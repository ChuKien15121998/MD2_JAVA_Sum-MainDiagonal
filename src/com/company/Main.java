package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row number of the array:  ");
        int row = input.nextInt();
        System.out.println("Enter the column number of the array: ");
        int column = input.nextInt();
        int[][] arrMatrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the ["+i+","+j+"] element: ");
                arrMatrix[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    sum = sum + arrMatrix[i][j];
                }
            }
        }
        System.out.println("Sum of the numbers on the main diagonal:  " + sum);
    }
}
