package Lab1;

public class Main {

    public static void main(String[] args) {
        MatrixCreator MatrixCreator = new MatrixCreator();
        int[][] array = Lab1.MatrixCreator.enterMatrix();
        int arrayMax = Lab1.MatrixCreator.discoverMax(array);
        int arrayMin = Lab1.MatrixCreator.discoverMin(array);
        int arraySum = Lab1.MatrixCreator.calculateSum(array);

        Lab1.MatrixCreator.printMatrix(array);
        System.out.println("\nMax: " + arrayMax + "\nMin: " + arrayMin + "\nSum: " + arraySum);
    }


}
