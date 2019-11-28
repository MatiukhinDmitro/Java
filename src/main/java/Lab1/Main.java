package Lab1;

public class Main {

    public static void main(String[] args) {
        MatrixCreator matrixCreator = new MatrixCreator();
        int[][] array = MatrixCreator.enterMatrix();
        int arrayMax = MatrixCreator.discoverMax(array);
        int arrayMin = MatrixCreator.discoverMin(array);
        int arraySum = MatrixCreator.calculateSum(array);

        MatrixCreator.printMatrix(array);
        System.out.println("\nMax: " + arrayMax + "\nMin: " + arrayMin + "\nSum: " + arraySum);
    }


}
