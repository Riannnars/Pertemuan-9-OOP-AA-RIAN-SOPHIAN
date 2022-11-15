/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LatihanLima {
    public String Kode, Nama, OUTPUT;
    public int HPP;
    public long HargaJual, Stok, JumlahJual, StokSekarang, TotalBayar, Laba;
    public LatihanLima (String Kode, String Nama, int HPP, long HargaJual, long Stok, long JumlahJual,String OUTPUT, long StokSekarang, long TotalBayar, long laba){
        this.Kode           = Kode;
        this.Nama           = Nama;
        this.HPP            = HPP;
        this.HargaJual      = HargaJual;
        this.Stok           = Stok;
        this.JumlahJual     = JumlahJual;
        this.OUTPUT         = OUTPUT;
        this.StokSekarang   = StokSekarang;
        this.TotalBayar     = TotalBayar;
        this.Laba           = laba;
    }
    public String tampilLatihanLima (){
        return ("Kode\t\t: "+ Kode + "\n"+"Nama\t\t: " + Nama + "\n"+"HPP\t\t:" + HPP +
                "\n"+"Harga Jual\t:"+ HargaJual +"\n"+"Stok\t\t:"+ Stok +"\n"+"Jumlah Jual\t:" + 
                JumlahJual+"\n"+"OUTPUT:"+ OUTPUT+"\n"+"Stok Sekarang\t:"+StokSekarang+"\n"+"Total Bayar\t:" + TotalBayar+"\n"+"Laba\t\t:"+Laba);
 
    }

}
class bukugambar extends LatihanLima {
    public bukugambar (String Kode, String Nama, int HPP, long HargaJual, long Stok, long JumlahJual, String OUTPUT, long StokSekarang, long TotalBayar, long Laba){
        super(Kode,Nama,HPP,HargaJual,Stok,JumlahJual,OUTPUT,StokSekarang,TotalBayar,Laba);
    }
}
class pensil2b extends LatihanLima{
    public pensil2b(String Kode, String Nama, int HPP, long HargaJual, long Stok, long JumlahJual, String OUTPUT, long StokSekarang, long TotalBayar, long Laba){
        super(Kode,Nama,HPP,HargaJual,Stok,JumlahJual,OUTPUT,StokSekarang,TotalBayar,Laba);
    }
}
class barang {
    public static void main(String args[]) {
        LatihanLima[] Lima = new LatihanLima [2];
        Lima[0]= new bukugambar("B001","BUKU GAMBAR",2500,3000,5,2," ",3,6000,1000);
        Lima[1]= new pensil2b("P002", "PENSIL 2B",1500,1750,10,1," ",9,1750,250);
        for (int i=0; i<2; i++){
            System.out.println("-------------------------");
            System.out.println("INPUT:");
            System.out.println(Lima[i].tampilLatihanLima());
            
        }
        
        
    }
    
}
