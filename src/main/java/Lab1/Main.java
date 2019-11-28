package Lab1;

public class Main {

    public static void main(String[] args) {
        MatrixCreator matrixCreator = new MatrixCreator();
        int[][] array = Lab1.MatrixCreator.enterMatrix();
        int arrayMax = Lab1.MatrixCreator.discoverMax(array);
        int arrayMin = Lab1.MatrixCreator.discoverMin(array);
        int arraySum = Lab1.MatrixCreator.calculateSum(array);

        Lab1.MatrixCreator.printMatrix(array);
        System.out.println("\nМакс: " + arrayMax + "\nМин: " + arrayMin + "\nСумма: " + arraySum);
    }


}
