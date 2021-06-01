/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lilikwn.beratideal;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
/**
 *
 * @author ASUS
 */
public class MainFrame extends Frame implements ActionListener{
    Label lNim, lNama, lBerat, lTinggi, lResult;
    TextField tfNim, tfNama, tfBerat, tfTinggi;
    Button hitung;
    MainFrame(){
        Frame frame = new Frame();
        lNim = new Label("NIM");
        lNama = new Label("NAMA");
        lBerat = new Label("BERAT");
        lTinggi = new Label("TINGGI");
        lResult = new Label("HASIL");
        tfNim = new TextField();
        tfNama = new TextField();
        tfBerat = new TextField();
        tfTinggi = new TextField();
        hitung = new Button("HITUNG");
        lNim.setBounds(50, 75, 70, 20);
        lNama.setBounds(50, 115, 70, 20);
        lBerat.setBounds(50, 155, 70, 20);
        lTinggi.setBounds(50, 195, 70, 20);
        tfNim.setBounds(130, 75, 180, 20);
        tfNama.setBounds(130, 115, 180, 20);
        tfBerat.setBounds(130, 155, 180, 20);
        tfTinggi.setBounds(130, 195, 180, 20);
        hitung.setBounds(50, 235, 70, 30);
        lResult.setBounds(50, 325, 500, 20);
        hitung.addActionListener(this);
        frame.add(lNim);frame.add(lNim);frame.add(lNama);frame.add(lBerat);frame.add(lTinggi);
        frame.add(lResult);frame.add(tfNim);frame.add(tfNama);frame.add(tfBerat);frame.add(tfTinggi);
        frame.add(hitung);
        frame.setLayout(null);
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String vNim = tfNim.getText();
        String vNama = tfNama.getText();
        double vBerat = Double.parseDouble(tfBerat.getText());
        double vTinggi = Double.parseDouble(tfTinggi.getText())/100;
        double hasil = 0;
        if(e.getSource()== hitung){
            hasil = vBerat/Math.pow(vTinggi,2);
            System.out.println(hasil);
            if(hasil >= 18.5 && hasil <= 24.9){
                lResult.setText(vNim + ", " +vNama+", BERAT ANDA SUDAH IDEAL");
            }else{
                lResult.setText(vNim + ", " +vNama+", BERAT ANDA BELUM IDEAL");
            }
        }
    }
    public static void main(String[] args) {
        new Menu();
    }
}
