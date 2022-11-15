/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class SepedaMotor {
    private String merk, tipe;
    private int tangki;
    private long harga;
    public void inputMerk (String merk){
        this.merk = merk;
    }
    public void inputTipe (String tipe){
        this.tipe = tipe;
    }
    public void inputTangki (int tangki){
        this.tangki = tangki;
    }
    public void inputHarga (long harga){
        this.harga = harga;
    }
    public String tampilMerk(){
        return merk;
        
    }
    public String tampilTipe(){
        return tipe;
    }
    
    public int tampilTangki(){
        return tangki;
    }
    public long tampilHarga(){
        return harga;
    }
    public static void main(String[] args){
        SepedaMotor motor = new SepedaMotor();
        motor.inputMerk("Yamaha");
        motor.inputTipe("MX - 125cc");
        motor.inputTangki(4);
        motor.inputHarga(15000000);
        System.out.println("Rincian Motor;");
        System.out.println("Merk : " + motor.tampilMerk());
        System.out.println("Tipe : " + motor.tampilTipe());
        System.out.println("Tangki : " + motor.tampilTangki());
        System.out.println("Harga :" + motor.tampilHarga());
        
        
    }
    
    
}
