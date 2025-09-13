package com.practice.basic;

public class PatternProblem {

    public static void main(String[] args) {
        int rowCount = 5;
        pattern1(rowCount);
        pattern2(rowCount);
        pattern3(rowCount);
        pattern4(rowCount);
        pattern5(rowCount);
        pattern6(rowCount);
        pattern7(rowCount);
        pattern8(rowCount);
        pattern9(rowCount);
    }

    
    public static void pattern1(int n) {
        for(int i = 0; i < 2 * n; i++) {
            int columnCount = i > n ? 2 * n - i : i;
            for (int j = 0; j < columnCount; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i = 0; i < 2 * n; i++) {
            int columnCount = i > n ? 2 * n - i : i;
            int spaceCount = n-columnCount;
            for (int s = 0; s < spaceCount; s++){
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for(int i = 1; i <= n; i++) {
            //int columnCount = i > n ? 2 * n - i : i;
            int spaceCount = n;
            for (int s = i; s < n; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                if (j == 1 || (i == n && j%2 != 0 ) || j == (2 * i - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                //System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static void pattern5 (int n) {
        for (int i = 0; i < 2*n; i++) {
            int totalColumn = i > n ? 2 * n - i : i;
            int columnSpace = n - totalColumn;
            for (int s = 0; s < columnSpace; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalColumn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6 (int n) {
        for (int i = 0; i < 2*n; i++) {
            int totalColumn = i > n ? 2 * n - i : i;
            int columnSpace = n - totalColumn;
            for (int s = 0; s < columnSpace; s++) {
                System.out.print("  ");
            }
            for (int j = i > n ? 2*n-i : i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= (i > n ? 2*n-i : i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i <= 2*n; i++) {
            int totalColumn = i > n ? i - n : n -i;
            int columnSpace = n == i ? 0 : n - totalColumn;
            for (int j = totalColumn; j >= 1; j--) {
                System.out.print("*");
            }
            for (int s = 0; s < columnSpace; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < columnSpace; s++) {
                System.out.print(" ");
            }
            for (int j = totalColumn; j >= 1; j--) {
                System.out.print("*");
            }
            if (n != i ) {
                System.out.println();
            }
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i <= 2*n; i++) {
            int totalColumn = (i > n) ? 2*n - i : i;
            int columnSpace = n == i ? 0 : n - totalColumn;
            for (int j = totalColumn; j >= 1; j--) {
                System.out.print("*");
            }
            for (int s = 0; s < columnSpace; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < columnSpace; s++) {
                System.out.print(" ");
            }
            for (int j = totalColumn; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 0; i <= 2*n; i++) {
            int totalColumn = i > n ? 2*n- i : i;
            int columnSpace = n == i ? 0 : n - totalColumn;
            for (int j = columnSpace; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int s = 0; s < totalColumn; s++) {
                System.out.print("* ");
            }
            for (int j = columnSpace; j >= 1; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}