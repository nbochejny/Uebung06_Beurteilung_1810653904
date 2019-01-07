import javax.swing.*;
import java.util.ArrayList;

public class Aufgabe4 {

    public static void main(String[] args){

        ArrayList<String> friends = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            friends.add(JOptionPane.showInputDialog("Please tell me your Friends"));

        for (int i = 0; i < 5; i++) {
            System.out.print(friends.get(i).toString() + " ");

           }
        }
    }

