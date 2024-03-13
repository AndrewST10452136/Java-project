/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical3;
import javax.swing.JOptionPane;
public class Practical3 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
       JOptionPane.showMessageDialog(null,"FUCK YOU"+ name);
       
       int Age =Integer.parseInt(JOptionPane.showInputDialog("How old are u"));
       JOptionPane.showMessageDialog(null,"you are"+ Age+"year old");
    }
}
