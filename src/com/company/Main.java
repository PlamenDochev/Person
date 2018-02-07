package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] matrix = new int[n];
        for (int row = 0; row < n ; row++) {
            matrix[row] = row * 5;
            System.out.println(matrix[row]);
        }

    }
}
