
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class LatihanSatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        String input1, input2;
        input1 = JOptionPane.showInputDialog("Masukkan Angka Pertama:");
        long harga1 = Integer.valueOf(input1).intValue();
        
        input2 = JOptionPane.showInputDialog("Masukkan Angka Kedua:");
        long harga2 = Integer.valueOf(input2).intValue();
        
        JOptionPane.showMessageDialog(null, harga1+"+"+harga2+" = "+(harga1+harga2));
    }
    }
    

