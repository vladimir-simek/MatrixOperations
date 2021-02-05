package cz.educanet.tranformations;

public class Main {

    public static void main(String[] args) {

        double rawA[][] = {
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,}
        };

        IMatrix matA = MatrixFactory.create(rawA);

        System.out.println(matA.get(0,0));
    }
}
