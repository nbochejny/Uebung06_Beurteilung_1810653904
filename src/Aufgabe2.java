import javax.swing.*;
import java.util.Random;

public class Aufgabe2 {
    public static void main(String[] args) {

        int length = Integer.parseInt(JOptionPane.showInputDialog("Put in your desired Arraylength, pretty pls"));
        int[] aufgabe2Array = new int[length]; //Array hat Länge laut input
        Random zufall = new Random();

        for (int i = 0; i < length; i++)
            aufgabe2Array[i] = zufall.nextInt(1000);  //pseudorandom zwischen 0 und der Zahl in Klammer

        for (int i = aufgabe2Array.length - 1; i >= 0; i--) {
            System.out.println(aufgabe2Array[i]);
        }

    }
}
