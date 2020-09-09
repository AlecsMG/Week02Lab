/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2application;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author 831690
 */
public class Lab2Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Hello?");
        String userReply = input.nextLine();
        
        if (userReply.toLowerCase().equals("hello")) {
            System.out.println("Hello World!");
            JOptionPane.showMessageDialog(frame, "Hello Console!");
            System.out.println("\n" + "Hello Popup!");
        }
        
    }
    
}
