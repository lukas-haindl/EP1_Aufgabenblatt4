/*
    Aufgabe 1) Code Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void printArray(int[] workArray) {
        for (int i = workArray.length; i > 0; i--) {
            System.out.print(workArray[i-1] + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] filledArray) {
        int number = 3;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = number;
            number += 3;
        }
    }

    private static void printContentFilteredArray(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 9 == 0) {
                copiedArray[i] = -1;
            }
        }
        printArray(copiedArray);
    }

    private static void fillArrayWithNewContent(int[] workArray) {
        int[] helpArray = new int[15];
        int number = 4;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = number;
            number += 4;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    public static void main(String[] args) {
        int[] filledArray = new int[15];
        fillArray(filledArray);
        printArray(filledArray);

        printContentFilteredArray(filledArray);
        printArray(filledArray);

        filledArray[0] = 123;
        printArray(filledArray);

        fillArrayWithNewContent(filledArray);
        printArray(filledArray);
    }

    //**************************************************************************
    //**** Notizen und Fragebeantwortungen bitte hier unterhalb durchführen! ***
    //**************************************************************************
    //Antwort zu Punkt a:
    //Das Erste Element in einem Array hat Index 0, durch dass i >= 0, wird im letzten Schleifendurchlauf versucht auf das Element auf Index -1 zuzugreifen, welchen es nicht gibt
    //Antwort zu Punkt b:
    //Weil ein Array nur eine Referenz ist und diese mitgegeben wird, wird direkt, dass Original Array verändert.
    //Antwort zu Punkt c:
    //Es wird keine echte Kopie erstellt, sondern die Referenz aufs ursprüngliche Array gesetzt.
    //Antwort zu Punkt d:
    //Das workArray in der Methode ist nur eine lokale Referenz, daher wirken sich Änderungen nicht aufs Original aus.
    //Antwort zu Zusatzfrage 1:
    //int, es würden aber auch short, byte und char funktionieren
    //Antwort zu Zusatzfrage 2:
    //Neues Array erstellen und die alten Werte kopieren
    //Antwort zu Zusatzfrage 3:
    //System.arraycopy(original, 0, copy, 0, original.length)
    //Antwort zu Zusatzfrage 4:
    //Nein, es wird die Referenzgleichheit geprüft.
}
