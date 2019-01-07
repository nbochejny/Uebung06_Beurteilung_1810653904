import javax.swing.*;
import java.util.Random;

public class Aufgabe3 {
    public static void main(String[] args) {
        Random zufall = new Random();
        int[] aufgabe3Array = new int[100];

        for (int i = 0; i < aufgabe3Array.length; i++)
            aufgabe3Array[i] = zufall.nextInt(100);

        while (true){
            int arrayStelle = Integer.parseInt(JOptionPane.showInputDialog("Which position do you want to change ?"));
            String decision = JOptionPane.showInputDialog("The current value is " + aufgabe3Array[arrayStelle] + " is that to your liking? Yes or No ?");
            if (decision.equals("Yes")) {
                try{
                    aufgabe3Array[arrayStelle] = Integer.parseInt(JOptionPane.showInputDialog("Put in a new number pls"));
                } catch (Exception e){
                    break;
                }
            }
        }
    }
}
