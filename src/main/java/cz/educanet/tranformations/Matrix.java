package cz.educanet.tranformations;

import kotlin.NotImplementedError;

import java.util.Arrays;

public class Matrix implements IMatrix {

    private final double[][] rawArray;

    public Matrix(double[][] rawArray) {
        this.rawArray = rawArray;
    }

    @Override
    public int getRows() {
        return rawArray.length;
    }

    @Override
    public int getColumns() {
        if (getRows() > 0)
            return rawArray[0].length;

        return 0;
    }

    @Override
    public IMatrix times(IMatrix matrix) {
        throw new NotImplementedError(); // TODO:
    }

    @Override
    public IMatrix times(Number scalar) {

        double[][] rawC = new double[getRows()][getColumns()];

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                int a = (int) get(i,j);

                rawC[i][j] = a * (int)scalar;
            }
        }

        IMatrix matC = MatrixFactory.create(rawC);

        return matC;

    }

    @Override
    public IMatrix add(IMatrix matrix) {

        double[][] rawC = new double[getRows()][getColumns()];

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                int a = (int) get(i,j);
                int b = (int) matrix.get(i,j);

                rawC[i][j] = a+b;
            }
        }

        IMatrix matC = MatrixFactory.create(rawC);

        return matC;
    }

    @Override
    public double get(int n, int m) {
        return rawArray[n][m];
    }

    //region Optional
    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public double determinant() {
        return 0;
    }
    //endregion
    //region Generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;

        for (int i = 0; i < rawArray.length; i++) {
            if(!Arrays.equals(rawArray[i], matrix.rawArray[i]))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(rawArray);
    }
    //endregion
}
