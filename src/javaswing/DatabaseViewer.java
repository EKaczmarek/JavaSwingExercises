/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.WEST;
import java.awt.Container;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Ela
 */
public class DatabaseViewer extends JFrame {
    private JButton czysc;
    private JButton wykonaj;
    
    private JPanel addPanel;
    
    private JLabel textGora;
    private JTextArea textDol;

    private JTextArea textSrodek;

    public void initComponents(){
        
        addPanel = new JPanel();
        this.add(addPanel);
        
        this.setTitle("DatabaseViewer");

        //do Rafala - jak przekazac np BorderLayout jako parametr?
        czysc = new JButton("Wyczysc");   
        this.add(czysc, BorderLayout.WEST);
      
        wykonaj = new JButton("Wykonaj");   
        this.add(wykonaj, BorderLayout.EAST);
        
        textGora = new JLabel();
        this.add(textGora, BorderLayout.NORTH);
        
        textDol = new JTextArea();
        this.add(textDol, BorderLayout.SOUTH);
        
        textSrodek = new JTextArea();
        this.add(textSrodek, BorderLayout.CENTER);



        this.setSize(500,500);
        this.setVisible(true);
    }
}
