package matrix;

import java.util.Arrays;

/**
 * Created by Dimaster on 28.06.2017.
 * *
 */
public class Matrix implements IMatrix{
    private double[][] matrix = new double[IMatrix.DEFAULT_MATRIX_SIZE][IMatrix.DEFAULT_MATRIX_SIZE];

    public Matrix(){

    }

    public Matrix (int rows, int column){
        matrix = new double[rows][column];
    }

    public Matrix (double[][] numbers){
        matrix = numbers;
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        matrix[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()){
            throw new IllegalArgumentException("Kolichestvo strok || Kolichestvo stolbcov !=");
        } else if (otherMatrix == null){
            throw new NullPointerException("Matrix == null");
        }
        if ((this.getRows() == otherMatrix.getRows()) && (this.getColumns() == otherMatrix.getColumns())){
            Matrix resultMatrix = new Matrix(this.getRows(),this.getColumns());
            for (int i = 0;i < resultMatrix.getRows(); i++){
                for (int j = 0; j < resultMatrix.getColumns(); j++) {
                    resultMatrix.setValueAt(i, j, this.getValueAt(i,j) + otherMatrix.getValueAt(i,j));
                }
            }
            return resultMatrix;
        }else {
            System.out.println("Eror rows or column != ");
            return null;
        }
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()){
            throw new IllegalArgumentException("Kolichestvo strok || Kolichestvo stolbcov !=");
        } else if (otherMatrix == null){
            throw new NullPointerException("Matrix == null");
        }
        if ((this.getRows() == otherMatrix.getRows()) && (this.getColumns() == otherMatrix.getColumns())){
            Matrix resultMatrix = new Matrix(this.getRows(),this.getColumns());
            for (int i = 0;i < resultMatrix.getRows(); i++){
                for (int j = 0; j < resultMatrix.getColumns(); j++) {
                    resultMatrix.setValueAt(i, j, this.getValueAt(i,j) - otherMatrix.getValueAt(i,j));
                }
            }
            return resultMatrix;
        }else {
            System.out.println("Eror rows or column != ");
            return null;
        }
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()){
            throw new IllegalArgumentException("Kolichestvo stolbcov 1 matrix != Kolichestvu strok 2 matrix ");
        } else if (otherMatrix == null){
            throw new NullPointerException("Matrix == null");
        }
        if (this.getColumns() == otherMatrix.getRows()){
            Matrix resultMatrix = new Matrix(this.getRows(),otherMatrix.getColumns());

        }
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + (matrix) +
                '}';
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows();i++){
            for (int j = 0; j < this.getColumns();j++){
                System.out.print(this.getValueAt(i,j) + " ");
            }
            System.out.println();
        }
    }
}
