package matrix;

/**
 * Created by Dimaster on 28.06.2017.
 * Matrix
 */
public class Main {
    public static void main(String[] args) {
        double[][] numbers = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
        double[][] numbers1 = {{2,4,6,8},{1,3,5,7},{2,4,6,8}};
        Matrix matrix1 = new Matrix(numbers);
        Matrix matrix2 = new Matrix(numbers1);
        IMatrix resultMatrix = matrix1.add(matrix2);
        resultMatrix.printToConsole();
    }
}
