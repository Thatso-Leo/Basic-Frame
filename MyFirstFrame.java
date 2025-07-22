/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author Leo
 */
    public class MyFirstFrame extends JFrame{
    
    public MyFirstFrame()
    {
        setTitle("My First GUI");
        setSize(300, 250);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setForeground(Color.YELLOW);
        setVisible(true);
    }
}
