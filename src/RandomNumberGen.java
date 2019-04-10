import javax.swing.*;

public class RandomNumberGen {

    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));
    }
}
