package cz.educanet.tranformations;

public class Main {

    public static void main(String[] args) {

        double[][] rawA = {
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,}
        };

        IMatrix matA = MatrixFactory.create(rawA);

        double[][] rawB = {
                {9, 8, 7,},
                {6, 5, 4,},
                {3, 2, 1,}
        };

        IMatrix matB = MatrixFactory.create(rawB);

        IMatrix matC = matA.add(matB);

        IMatrix matD = matA.times(2);
        IMatrix matE = matA.times(matB);

        System.out.println(matC);
        System.out.println(matD);
        System.out.println(matE);

        System.out.println("gey");
    }
}
