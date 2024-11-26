/*
    Aufgabe 2) Eindimensionale Arrays
*/
public class Aufgabe2 {

    public static void main(String[] args) {
        //a)----
        short[] shorts = {3, 6, 24, 31, 35, 44, 67, 73, 89, 92};
        System.out.print("|" + shorts[0]);
        for (int i = 1; i < shorts.length; i++) {
            System.out.print(";" + shorts[i]);
        }
        System.out.println("|");
        //----a)
        //b)----
        char[] chars = {'a', '8', '8', 'G', '2', ':', ':', ':', 'F', '7', 'b', 'b', '-', 'T'};
        char tmp = chars[0];
        int arrSize = 1;
        for (int i = 1; i < chars.length; i++) {
            if (tmp == chars[i]) {
                arrSize++;
            }
            arrSize++;
            tmp = chars[i];
        }
        char[] resultChars = new char[arrSize];
        tmp = chars[0];
        resultChars[0] = tmp;
        int posResultChars = 1;
        for (int i = 1; i < chars.length; i++) {
            if (tmp == chars[i]) {
                resultChars[posResultChars] = '+';
                posResultChars++;
            }
            resultChars[posResultChars] = chars[i];
            tmp = chars[i];
            posResultChars++;
        }
        for (char x : resultChars) {
            System.out.print(x + " ");
        }
        System.out.println();
        //----b)
        //c)----
        int n = 20;
        int[] ints = new int[n];
        for (int i = 1; i <= n; i++) {
            ints[i - 1] = n - i;
        }
        System.out.print("for-Schleife: ");
        for (int i = ints.length - 1; i > 0; i--) {
            System.out.print(ints[i] + "!");
        }
        System.out.println(ints[0]);

        System.out.print("while-Schleife: ");
        int i = ints.length - 1;
        while (i > 0){
            System.out.print(ints[i] + "!");
            i--;
        }
        System.out.println(ints[i]);
        //----c)
    }
}

