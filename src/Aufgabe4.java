/*
    Aufgabe 4) Zweidimensionale Arrays
*/

import java.util.Arrays;

public class Aufgabe4 {

    private static int[][] generateFilled2DArray(int n) {
        int[][] array = new int[n][n];
        int halfN = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == halfN && i == halfN){
                    array[i][j] = 1;
                }
                else if (Math.abs(i - halfN) <= 1 && Math.abs(j - halfN) <= 1){
                    array[i][j] = -1;
                }
                else {
                    if (j < i){
                        array[i][j] = i + 1 - j;
                    }
                    else{
                        array[i][j] = j + 1 - i;
                    }
                }
            }
        }

        return array;
    }

    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(int[][] inputArray) {
        if (inputArray != null) {
            for (int[] arr : inputArray) {
                for (int val : arr) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }
    }

    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(int[] inputArray) {
        if (inputArray != null) {
            for (int val : inputArray) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] array = generateFilled2DArray(1);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{1}}));
        System.out.println("-----");

        array = generateFilled2DArray(3);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{-1, -1, -1}, {-1, 1, -1}, {-1, -1, -1}}));
        System.out.println("-----");

        array = generateFilled2DArray(5);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{1, 2, 3, 4, 5}, {2, -1, -1, -1, 4}, {3, -1, 1, -1, 3},
                {4, -1, -1, -1, 2}, {5, 4, 3, 2, 1}}));
        System.out.println("-----");

        array = generateFilled2DArray(7);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{1, 2, 3, 4, 5, 6, 7}, {2, 1, 2, 3, 4, 5, 6}, {3, 2, -1, -1, -1, 4, 5},
                {4, 3, -1, 1, -1, 3, 4}, {5, 4, -1, -1, -1, 2, 3}, {6, 5, 4, 3, 2, 1, 2}, {7, 6, 5, 4, 3, 2, 1}}));
        System.out.println("-----");
        System.out.println();
    }
}
