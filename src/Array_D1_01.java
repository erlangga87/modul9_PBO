/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erlangga
 */
import java.util.*;
import javax.swing.JOptionPane;

class Array_D1_01 {

    public static void main(String[] args) {
        int a, n, jml_nil = 0;
        double nil_rata = 0;
        int[] nilai;         // deklarasi variabel array
        nilai = new int[10]; // membuat objek array
        
        String bilangan = JOptionPane.showInputDialog("masukkan banyaknya siswa : ");

        n = Integer.parseInt(bilangan);
        System.out.println("");
        for (a = 1; a <= n; a++) {
            String biji = JOptionPane.showInputDialog("masukkan nilai siswa ke "+ a + ": ");
            nilai[a] = Integer.parseInt(biji);
        }

            for (a = 1; a <= n; a++) {
            JOptionPane.showMessageDialog(null,"Nilai " + a + " = " + nilai[a]);
             
           jml_nil = jml_nil + nilai[a];
        }

        nil_rata = jml_nil / n;
        JOptionPane.showMessageDialog(null,"Jumlahy Nilai = " + jml_nil);
        JOptionPane.showMessageDialog(null,"Nilai-Rata Array Nilai = " + nil_rata);
        
    }
}
