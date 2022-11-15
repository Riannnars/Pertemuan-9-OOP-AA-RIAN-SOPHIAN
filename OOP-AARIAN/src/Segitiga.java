
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Segitiga {
    String alas, tinggi;
    public void input(){
        alas = JOptionPane.showInputDialog("Masukkan Alas:");
        tinggi = JOptionPane.showInputDialog("Masukkan Tinggi:");
    
}
public double hitung(){
        long a = Long.parseLong(alas);
        long t = Long.parseLong(tinggi);
        return (0.5*a*t);
    }
public void hasil(){
    JOptionPane.showMessageDialog(null,"0.5 " +alas+" * "+tinggi+" = "+hitung());
}    
}
class luas_segitiga{
public static void main(String[] args){
    Segitiga m = new Segitiga();
    m.input();
    m.hasil();
    
}
}