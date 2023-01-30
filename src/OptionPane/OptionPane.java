package OptionPane;

import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String[] args)  {
        // JOptionPane.showMessageDialog(null, "Hello user u have sucessfully logged in", "Login Successful", JOptionPane.PLAIN_MESSAGE, null);
        // JOptionPane.showMessageDialog(null, "Hello user u have sucessfully logged in", "Login Successful", JOptionPane.INFORMATION_MESSAGE, null);
        // JOptionPane.showMessageDialog(null, "Hello user u have sucessfully logged in", "Login Successful", JOptionPane.QUESTION_MESSAGE, null);
        // JOptionPane.showMessageDialog(null, "Hello user u have sucessfully logged in", "Login Successful", JOptionPane.WARNING_MESSAGE, null);
        // JOptionPane.showMessageDialog(null, "Hello user u have sucessfully logged in", "Login Successful", JOptionPane.ERROR_MESSAGE, null);

        //wehn we prees yes it returns 0,no 1,cancel 2,x -1
        int ans = JOptionPane.showConfirmDialog(null, "Hello user u have sucessfully logged in", "Login Successful", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(ans);

        String name = JOptionPane.showInputDialog(null, "what u r name");
        System.out.println("name mf"+name);

        // showOptionDialog is very useful in this u can add icon



    }
}
