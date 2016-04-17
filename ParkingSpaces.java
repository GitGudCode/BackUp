package ParkingSpaces;

import  java.util.Scanner;
public class ParkingSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int matrixRows = Integer.parseInt(data[0]);
        int matrixColums = Integer.parseInt(data[1]);

        boolean[][] matrix = new boolean[matrixRows][matrixColums];
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int stepsCOunter = 1;
            int startRow = Integer.parseInt(data[0]);
            int parkRow = Integer.parseInt(data[1]);
            if (isRowFull(matrix, parkRow)) {
                System.out.printf("Row %d full\n", parkRow);
            } else {
                int parkCol = Integer.parseInt(data[2]);
                stepsCOunter += Math.abs(parkRow - startRow);
                stepsCOunter += parkCol;
                if (!matrix[parkRow][parkCol]) {
                    matrix[parkRow][parkCol] = true;
                    System.out.print(stepsCOunter);
                }
            }
            input = scanner.nextLine();
        }
    }
    private static boolean isRowFull(boolean matrix[][], int row){
        for (int i = 0; i < matrix[row].length; i++) {
            if(matrix[row][i] == false){
                return  false;
            }
            
        }
        return true;
    }
}
