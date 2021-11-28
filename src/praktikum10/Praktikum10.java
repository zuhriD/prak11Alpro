/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author LENOVO
 */
public class Praktikum10 extends JFrame{
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Copy");
    JTextArea txnama = new JTextArea(10,10);
    
    Praktikum10(){
        super("Coba Event Handling");
        setLocation(200,300);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    void tampilan(){
        getContentPane().add(nama);
        nama.append("Nama Kamu Siapa?");
        getContentPane().add(bt);
        getContentPane().add(txnama);
        txnama.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    
    void aksi_reaksi(){
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               txnama.append(nama.getText());
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Praktikum10 ss = new Praktikum10();
        ss.tampilan();
        ss.aksi_reaksi();
    }
    
}
