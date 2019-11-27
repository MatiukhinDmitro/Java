package Lab1;

import java.util.Scanner;
import java.util.Random;
public class Matrix {
    private static final int BORDER_MAX_RANDOM = 5;
    public static void main(String args[]) {
        boolean flag = false;
        do {
            System.out.println("Matrix build option:\nManual\nAuto");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            switch (choice) {
                case "Manual":
                    Scanner inputScanner = new Scanner(System.in);
                    System.out.println("Enter The Number Of Matrix Rows");
                    int matrixRow = inputScanner.nextInt();
                    System.out.println("Enter The Number Of Matrix Columns");
                    int matrixCol = inputScanner.nextInt();
                    int[][] matrix = new int[matrixRow][matrixCol];
                    enterMatrixData(inputScanner, matrix, matrixRow, matrixCol);
                    printMatrix(matrix, matrixRow, matrixCol);
                    break;
                case "Auto":
                    Random arbitrary = new Random();
                    int matrixRowAuto = arbitrary.nextInt(BORDER_MAX_RANDOM);
                    int matrixColAuto = arbitrary.nextInt(BORDER_MAX_RANDOM);
                    int[][] matrixAuto = new int[matrixRowAuto][matrixColAuto];
                    setMatrixDataAuto(arbitrary, matrixAuto, matrixRowAuto, matrixColAuto);
                    printMatrix(matrixAuto, matrixRowAuto, matrixColAuto);
                    break;
                default:
                    System.out.println("Invalid choice");
                    flag = true;
                    break;
            }
        } while (flag == true);
    }
    private static void enterMatrixData(Scanner matrixNumberInput, int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Enter Matrix Data");
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrix[i][j] = matrixNumberInput.nextInt();
            }
        }
    }
    private static void printMatrix(int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Your Matrix is : ");
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void setMatrixDataAuto(Random arbitrary, int[][] matrixAuto, int matrixRowAuto, int matrixColAuto) {
        for (int i = 0; i < matrixRowAuto; i++) {
            for (int j = 0; j < matrixColAuto; j++) {
                matrixAuto[i][j] = arbitrary.nextInt();
            }
        }
    }

